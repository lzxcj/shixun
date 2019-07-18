//3、创建c:/test.txt文件并在其中输入"hello world"
//创建一个输入流读取该文件中的文本
//并且把小写的l变成大写L再利用输出流写入到d:\test.txt中  [必做题] 
//3.1 实现步骤：
//3.1.1 在本地硬盘C盘下创建一个文件test.txt
//3.1.2 创建一个包含main()方法的类，并在main中编写代码
//3.1.3 运行代码并且测试结果
//3.2 实现过滤器的功能
//效果显示：
package shixun3;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Homework3
{
	public static void main(String[] args)
	{
		try {
			File f=new File("d:/test.txt");
			File f1=new File("d:/test1.txt");
			FileInputStream fous=new FileInputStream(f);
			FileOutputStream fou=new FileOutputStream(f1);  
			System.out.println(fous.read());
			System.out.println("从文件"+f+"读取的内容是"+"hello world");
			int c=1;
			while((c=fous.read())!=-1)
			{
				if((char)c=='l')
				{
					c='L';
				}else {}
				fou.write(c);
			}
			fous.close();
			fou.close();
			System.out.println("通过过滤流写入文件"+f1+"的内容是："+"heLLo worLd");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("写入成功");
		}
	}
}
