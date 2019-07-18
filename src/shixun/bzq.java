package shixun;
import java.util.*;
import java.text.*;
public class bzq
{
	public static void main(String[] args) throws ParseException
	{
		System.out.println("请输入产品的生产日期:yyyy-MM-dd");
		String pro=new Scanner(System.in).next();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date pro1=(Date)sdf.parse(pro);
		System.out.println("请输入保质期（天）");
		int day=new Scanner(System.in).nextInt();
		Calendar c=Calendar.getInstance();
		String c1=sdf.format(c.getTime());
		System.out.println("当前日期为"+c1);
		long a=c.getTime().getTime()-pro1.getTime();
		long b=a/(1000*24*60*60);
		System.out.println(b);
		if(b<day)
		{
			System.out.println("没有过期");
			long d=day-b;
			System.out.println("还有"+d+"天过期");
		}
		else
		{
			System.out.println("过期了");
		}
				
	}


}