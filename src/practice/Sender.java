package practice;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

class SendThread extends Thread
{
	Socket s;
	SendThread(Socket s)
	{
		this.s=s;
	}
	public void run()
	{
		boolean flag=true;
		try {
			while(flag)
			{
				DataOutputStream dos=new DataOutputStream(s.getOutputStream());
				String s1=new Scanner(System.in).next();
				if(s1.equals("exit"))
				{
					System.out.println("您已成功下线");
					flag=false;
				}
				dos.writeUTF(s1);
			}
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
}