package shixun5;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
public class Server 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("服务端");
		ServerSocket ss=new ServerSocket(2326);
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String s1=dis.readUTF();
			try {
				String[] s2=s1.split("\\s+");
				for(int i=0;i<s2.length;i++)
				{
					for(int j=0;j<i;j++)
					{
						int a=Integer.parseInt(s2[i]);
						int b=Integer.parseInt(s2[j]);
						if(b>a)
						{
							s2[j]=Integer.toString(a);
							s2[i]=Integer.toString(b);
						}
					}
				}
				for(int k=0;k<s2.length;k++)
				{
					System.out.print(s2[k]);
				}
			} catch (NumberFormatException e) {
				System.out.println("格式错误");
			}
		
	}
}
