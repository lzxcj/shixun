//�ڱ����Ĵ���ϵͳ�У���һ���ļ��У�����File����ṩ�������г����ļ����е������ļ����ļ������ļ���·����ִ��Ч�����£�[������]
//·����xxx���ļ����ڵ��ļ��У�
// 	�ļ�����abc.txt
//	·������c:\temp\abc.txt 
//	--------------------------------------------
//	�ļ�����def.txt
//	·������c:\temp\def.txt
package shixun3;
import java.io.*;
public class Homework1
{
	public static void main(String[] args)
	{
		File f=new File("d:/temp");
		System.out.println("·������"+f+"���ļ����ڵ��ļ��У�");
		File[] f1=f.listFiles();
		
		for(int i=0;i<f1.length;i++)
		{
			File f0=f1[i];
			System.out.println("�ļ�����"+f0.getName());
			System.out.println("·������"+f0.getAbsolutePath());
			System.out.println("-------------------------------");
		}
	}
}
