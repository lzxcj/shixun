package shixun2;
import java.util.*;
public class extra11 
{
	public static void main(String[] args) throws ByteSizeException
	{		
			System.out.println("请输入一个数");
			int a=new Scanner(System.in).nextInt();
			decide(a);

	}
	public static void decide(int a1)throws ByteSizeException
	{
		if(a1>127||a1<-128)
		{
			throw new ByteSizeException("这个数不是byte类型的");
		}
	}
}
class ByteSizeException extends Exception 
{
	ByteSizeException(String message)
	{
		super(message);
	}

}