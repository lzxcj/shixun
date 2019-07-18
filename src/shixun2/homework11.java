package shixun2;
import java.util.*;
public class homework11
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("请输入一个被除数");
			int a=new Scanner(System.in).nextInt();
			System.out.println("请输入一个除数");
			int b=new Scanner(System.in).nextInt();
			System.out.println(a/b);
		}catch(NumberFormatException e) {
			System.out.println("格式错误");
		}catch(ArithmeticException ae) {
			System.out.println("除数不能为0");
		}finally {
			System.out.println("总是被执行");
		}
	}
}
