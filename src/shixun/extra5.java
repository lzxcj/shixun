package shixun;
import java.util.*;
public class extra5
{
	public static void main(String[] args)
	{
		System.out.println("������һ������");
		String a=new Scanner(System.in).next();
		StringBuffer k=new StringBuffer(a);
		StringBuffer m=k.reverse();
		String b=m.toString();
		if(b.equals(a))
		{
			System.out.println("������ǻ�����");
		}
		else
		{
			System.out.println("��������ǻ�����");
		}
		
	}
}
