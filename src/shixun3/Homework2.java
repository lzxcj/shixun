//2����дһ��java����ʵ���ļ����ƹ��ܣ�
//Ҫ��d:/io/copysrc.doc�е����ݸ��Ƶ�d:/io/copydes.doc�С�]
package shixun3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Homework2 
{
	public static void main(String[] args)
	{
		BufferedWriter bw=null;
		BufferedReader br=null;
		try {
			File f1=new File("d:/io/copysrc.doc");
			File f2=new File("d:/io/copydes.doc");
			FileReader fr=new FileReader(f1);
			br=new BufferedReader(fr);
			FileWriter fw=new FileWriter(f2);
			bw=new BufferedWriter(fw);
			String str;
			while((str=br.readLine())!=null) {
				bw.write(str);
				bw.newLine();
			}
			bw.close();
			bw.flush();
			br.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("�ļ����Ƴɹ�");
	}
}
