package shixun3;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
public class BufferedReaderDemo 
{
	public static void main(String[] args)
	{
		BufferedWriter bw=null;
		BufferedReader br=null;
		try {
			File file=new File("d:/io/aq.txt");
			FileReader fr=new FileReader(file);
			br=new BufferedReader(fr);
			FileWriter fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			System.out.println((char) br.read());
			System.out.println((char) br.read());
			System.out.println(br.readLine());
			String str;
			while((str=br.readLine())!=null) {
				bw.write(str);
				bw.newLine();
			}
			bw.flush();
			br.close();
			bw.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("文件复制成功");
	}
}
