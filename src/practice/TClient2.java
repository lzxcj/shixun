package practice;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
public class TClient2 
{
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		System.out.println("--------------Client2-------------------------");
		System.out.println("¿Í»§¶Ë");
		Socket s=new Socket("127.0.0.2",1246);
		SendThread se1=new SendThread(s);
		se1.start();
		RecieveThread r2=new RecieveThread(s);
		r2.start();
	}
}
