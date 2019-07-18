package shixun;
import java.util.*;
public class extra5
{
	public static void main(String[] args)
	{
		System.out.println("请输入一个整数");
		String a=new Scanner(System.in).next();
		StringBuffer k=new StringBuffer(a);
		StringBuffer m=k.reverse();
		String b=m.toString();
		if(b.equals(a))
		{
			System.out.println("这个数是回文数");
		}
		else
		{
			System.out.println("这个数不是回文数");
		}
		
	}
}
