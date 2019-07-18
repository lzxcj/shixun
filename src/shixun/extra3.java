package shixun;
import java.util.*;
public class extra3
{
	public static void main(String[] args)
	{
		System.out.println("请输入一个字符串");
		String a=new Scanner(System.in).next();
		System.out.println("请输入一个子字符串");
		String b=new Scanner(System.in).next();
		int num=0;
		int index=0;
		do 
		{
			int s=a.indexOf(b, index);
			index=s+b.length();
			num++;
		}while((index=a.indexOf(b, index))!=-1);
		System.out.println("该字符串中含有"+num+"个子字符串");
	}
}
