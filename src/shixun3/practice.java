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
			System.out.println("�ļ�����");
			f.delete();
			System.out.println("�ļ�ɾ���ɹ�");
		}
		else {
			try {
				f.createNewFile();
			}catch(IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		System.out.println("�ļ�����"+f.getName());
		System.out.println("�ļ���·����"+f.getPath());
		System.out.println("�ļ��ľ���·����"+f.getAbsolutePath());
		System.out.println(f.canRead() ? "�ļ��ǿɶ���" : "�ļ��ǲ��ɶ���");
		System.out.println(f.canWrite() ? "�ļ��ǿ�д��" : "�ļ��ǲ���д��");*/
//		Path path = Paths.get("C:/windows");
//		System.out.println("�ļ��ڵ���:" + path.getNameCount());
//		System.out.println("�ļ�����:" + path.getFileName());
//		System.out.println("�ļ���Ŀ¼:" + path.getRoot());
//		System.out.println("�ļ��ϼ�����Ŀ¼:" + path.getParent());
		/*���Ŀ��·�� */
		try {
			File f=new File("d:/io/a.txt");
			FileInputStream fis=new FileInputStream(f);
			//ʹ��read()��������ȡһ���ֽڵ�����
			System.out.println((char)fis.read()+"\n");
			//ʹ��read()������ȡ�ļ��е�ȫ������
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
