package shixun;
import java.util.*;
public class homework1
{
	public static void main(String[] args)
	{
		System.out.println("请输入第一个数");
		String a=new Scanner(System.in).next();
		System.out.println("请输入第二个数");
		String b=new Scanner(System.in).next();
		double a1=new Double(a);
		double b1=new Double(b);
		double c=a1+b1;
		System.out.println("两个数的和为"+c);
	}
}
