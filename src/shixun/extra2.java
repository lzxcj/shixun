package shixun;
import java.util.*;
public class extra2
{
	public static void main(String[] args)
	{
		mailtest.testmail();
	}
}
class mailtest
{
	public static boolean testmail()
	{
		System.out.println("������һ�������ַ");
		String a=new Scanner(System.in).next();
		char[] ch=a.toCharArray();
		int num=0;
		int num1=0;
		int m=a.indexOf('@');
		int n=a.indexOf('.');
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='@')
			{
				num++;
			}
			if(ch[i]=='.')
			{
				num1++;
			}
		}
		if(num==0 & num1==0)
		{
			System.out.println("���Ϸ��������ַ�в�����@��.");
			return false;
		}
		if(num>1 || num1>1)
		{
			System.out.println("���Ϸ��������ַ�к��ж���@��.");
			return false;
		}
		if(m>n)
		{
			System.out.println("���Ϸ��������ַ��.������@��ǰ��");
			return false;
		}
		else
		{
			System.out.println(a);
			return true;
		}
	}
}