package shixun2;
import java.util.*;
public class homework12
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("�������һ���ַ���");
			String a=new Scanner(System.in).next();
			System.out.println("������ڶ����ַ���");
			String b=new Scanner(System.in).next();
			compare(a,b);
		}catch(NullPointerException e) {
			System.out.println("��һ���ַ���Ϊ��");
		}
	}
	public static void compare(String a1,String a2)throws NullPointerException
	{
		if(a1==""||a2=="")
		{
			throw new NullPointerException();
		}
	}
}
