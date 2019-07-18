package practice;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class TClient 
{
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		System.out.println("--------------CLIENT--------------");
		System.out.println("¿Í»§¶Ë:");
		Socket s=new Socket("127.0.0.1",1246);
		SendThread c1=new SendThread(s);
		c1.start();
		RecieveThread r1=new RecieveThread(s);
		r1.start();
	}
}
