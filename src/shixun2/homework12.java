package shixun2;
import java.util.*;
public class homework12
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("请输入第一个字符串");
			String a=new Scanner(System.in).next();
			System.out.println("请输入第二个字符串");
			String b=new Scanner(System.in).next();
			compare(a,b);
		}catch(NullPointerException e) {
			System.out.println("有一个字符串为空");
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
