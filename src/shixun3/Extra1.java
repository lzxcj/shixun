//���ڳ����д���һ��Student���͵Ķ���
//���Ѷ�����Ϣ���浽d:/io/student.txt�ļ��У�
//Ȼ���ٴ��ļ��а�Student�������Ϣ������ʾ�ڿ���̨�ϣ�Student����������£�]
package shixun3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Extra1 
{
	public static void main(String[] args) throws Exception
	{
			Student A=new Student(111,"С��","12��9��");
			File f=new File("d:/io/student.txt");
			FileWriter fw=new FileWriter(f);
			fw.write(A.toString());
			fw.close();
			FileReader fr=new FileReader(f);			
			char[] ch=new char[200];
			int len=fr.read(ch);
			String s=new String(ch,0,len);
			System.out.println(s);
			fr.close();
	}
}
class Student
{
	private int id;
	private String name;
	private String birth;
	Student(){}
	Student(int id,String name,String birth)
	{
		this.id=id;
		this.name=name;
		this.birth=birth;
	}
	public int getId()
	{
		return id;
	}
	public  void setId(int id)
	{
	}
	public String getName()
	{
		return name;
	}
	public  void setName(String name)
	{
	}
	public String getBirth()
	{
		return birth;
	}
	public  void setBirth(String birth)
	{
	}
	public String toString()
	{
		String s=(Integer)id+"";
		return "id="+s+"name="+name+""+"birth="+birth+"";
	}
}