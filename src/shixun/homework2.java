package shixun;
import java.util.Scanner;
public class homework2 
{
	public static void main(String[] args)
	{
		System.out.println("请输入一串字母");
		String a=new Scanner(System.in).next();
		char[] c=a.toCharArray();
		int num=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='e')
			{
				num++;
			}
		}
		System.out.println("有"+num+"个e");
	}
}
