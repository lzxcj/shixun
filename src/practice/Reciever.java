package practice;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

class RecieveThread extends Thread
{
	Socket s;
	RecieveThread(Socket s)
	{
		this.s=s;
	}
	public void run()
	{
		try {
			while(true)
			{
				DataInputStream dis=new DataInputStream(s.getInputStream());
				System.out.println(s.getLocalAddress()+"收到的消息"+dis.readUTF());
				System.out.println("请回复");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}