package shixun2;
import java.util.*;
public class homework11
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("������һ��������");
			int a=new Scanner(System.in).nextInt();
			System.out.println("������һ������");
			int b=new Scanner(System.in).nextInt();
			System.out.println(a/b);
		}catch(NumberFormatException e) {
			System.out.println("��ʽ����");
		}catch(ArithmeticException ae) {
			System.out.println("��������Ϊ0");
		}finally {
			System.out.println("���Ǳ�ִ��");
		}
	}
}
