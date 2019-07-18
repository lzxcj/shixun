package shixun3;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo 
{
	public static void main(String[] args)
	{
		FileOutputStream fout=null;
		try {
			fout=new FileOutputStream("d:/io/c.txt");
			
			byte[] ch= {'a','1','c','2','e','3'};
			fout.write(ch);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fout !=null)
			{
				try {
					fout.close();
				}catch(IOException e1) {
					e1.printStackTrace();
				}
			}
			System.out.println("文件写入成功");
		}
	}
}
