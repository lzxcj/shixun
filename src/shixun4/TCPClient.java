package shixun4;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
public class TCPClient 
{
	public static void main(String[] args)throws IOException,UnknownHostException
	{
		Socket s=new Socket("127.0.0.1",3336);
		OutputStream os=s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("Hello Server!");
		dos.flush();
		dos.close();
		os.close();
	}
}
