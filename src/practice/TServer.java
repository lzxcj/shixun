package practice;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class TServer 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("---------SERVER-------------");
		System.out.println("服务端已连接...");
		ServerSocket ss=new ServerSocket(1246);
		while(true)
		{
			Socket s=ss.accept(); 
			RecieveThread r=new RecieveThread(s);
			r.start();
			SendThread se=new SendThread(s);
			se.start();
		}
	}
}