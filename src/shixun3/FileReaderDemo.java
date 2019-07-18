package shixun3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo 
{
	public static void main(String[] args)
	{
		File f=new File("d:/io/b.txt");
		FileReader fr=null;
		try
		{
			fr=new FileReader(f);
			int c;
			while((c=fr.read())!=-1)
			{
				System.out.println((char)c);
			}
		}catch(FileNotFoundException e) {
			System.out.println("Ҫ��ȡ���ļ�������");
			e.printStackTrace();
		}catch(IOException e1) {
			System.out.println("��ȡ����");
			e1.printStackTrace();
		}finally {
			try {
				if(fr!=null)
				{
					fr.close();
				}
			}catch(IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
