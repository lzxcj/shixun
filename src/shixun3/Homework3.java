//3������c:/test.txt�ļ�������������"hello world"
//����һ����������ȡ���ļ��е��ı�
//���Ұ�Сд��l��ɴ�дL�����������д�뵽d:\test.txt��  [������] 
//3.1 ʵ�ֲ��裺
//3.1.1 �ڱ���Ӳ��C���´���һ���ļ�test.txt
//3.1.2 ����һ������main()�������࣬����main�б�д����
//3.1.3 ���д��벢�Ҳ��Խ��
//3.2 ʵ�ֹ������Ĺ���
//Ч����ʾ��
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
			System.out.println("���ļ�"+f+"��ȡ��������"+"hello world");
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
			System.out.println("ͨ��������д���ļ�"+f1+"�������ǣ�"+"heLLo worLd");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("д��ɹ�");
		}
	}
}
