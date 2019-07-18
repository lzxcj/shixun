package shixun5;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Client 
{
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		System.out.println("请输入一组整数,中间用空格隔开");
		Socket s=new Socket("127.0.0.1",2326);
		String s0=new Scanner(System.in).nextLine();
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		dos.writeUTF(s0);
		dos.close();
	}
}
