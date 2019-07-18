package shixun3;

import java.io.*;
import java.nio.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;


public class practice 
{
	public static void main(String[] args)
	{
		/*File f=new File("d:/io/i.txt");
		if(f.exists())
		{
			System.out.println("文件存在");
			f.delete();
			System.out.println("文件删除成功");
		}
		else {
			try {
				f.createNewFile();
			}catch(IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		System.out.println("文件名是"+f.getName());
		System.out.println("文件的路径是"+f.getPath());
		System.out.println("文件的绝对路径是"+f.getAbsolutePath());
		System.out.println(f.canRead() ? "文件是可读的" : "文件是不可读的");
		System.out.println(f.canWrite() ? "文件是可写的" : "文件是不可写的");*/
//		Path path = Paths.get("C:/windows");
//		System.out.println("文件节点数:" + path.getNameCount());
//		System.out.println("文件名称:" + path.getFileName());
//		System.out.println("文件根目录:" + path.getRoot());
//		System.out.println("文件上级关联目录:" + path.getParent());
		/*监控目标路径 */
		try {
			File f=new File("d:/io/a.txt");
			FileInputStream fis=new FileInputStream(f);
			//使用read()方法，读取一个字节的内容
			System.out.println((char)fis.read()+"\n");
			//使用read()方法读取文件中的全部内容
			byte b[]=new byte[fis.available()];
			fis.read(b);
			int j=0;
			while(j<b.length) {
				System.out.println((char)b[j]);
				j++;
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e2) {
			e2.printStackTrace();
		}


	}
}
