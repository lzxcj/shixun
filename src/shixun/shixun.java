package shixun;
import java.util.*;
import java.text.*;
public class shixun 
{
	public static void main(String args[])throws ParseException
	{
		/*System.out.println("请输入手机号");
		String i=new Scanner(System.in).next();
		StringBuffer i1=new StringBuffer(i);
		StringBuffer a=i1.replace(3,7,"****");
		System.out.println(a);*/
		
		/*System.out.println("请输入第一个数字");
		double a1=new Scanner(System.in).nextDouble();
		System.out.println("请输入第二个数字");
		double a2=new Scanner(System.in).nextDouble();
		System.out.println("请输入第二个数字");
		double a3=new Scanner(System.in).nextDouble();
		double p=(a1+a2+a3)/2;
		double S=Math.sqrt(p*(p-a1)*(p-a2)*(p-a3));
		System.out.println(S);*/
		
		System.out.println("输入两个日期yyyy-MM-dd");
		String a=new Scanner(System.in).next();
		String b=new Scanner(System.in).next();
		System.out.println(max(a,b));
		
				
		}
	
	public static Date max(String date1,String date2)throws ParseException
	{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date a=(Date)sdf.parse(date1);
		Date b=(Date)sdf.parse(date2);
		if(a.before(b))
		{
			return b;
		}else {
			return a;
		}
}
}
