//在本机的磁盘系统中，找一个文件夹，利用File类的提供方法，列出该文件夹中的所有文件的文件名和文件的路径，执行效果如下：[必做题]
//路径是xxx的文件夹内的文件有：
// 	文件名：abc.txt
//	路径名：c:\temp\abc.txt 
//	--------------------------------------------
//	文件名：def.txt
//	路径名：c:\temp\def.txt
package shixun3;
import java.io.*;
public class Homework1
{
	public static void main(String[] args)
	{
		File f=new File("d:/temp");
		System.out.println("路径中是"+f+"的文件夹内的文件有：");
		File[] f1=f.listFiles();
		
		for(int i=0;i<f1.length;i++)
		{
			File f0=f1[i];
			System.out.println("文件名："+f0.getName());
			System.out.println("路径名："+f0.getAbsolutePath());
			System.out.println("-------------------------------");
		}
	}
}
