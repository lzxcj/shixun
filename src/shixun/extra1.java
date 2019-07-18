package shixun;
import java.text.*;
import java.util.*;
public class extra1 
{
	public static void main(String[] args) throws ParseException
	{
		System.out.println("请输入北京时间：yyyy-MM-dd-hh");
		String time=new Scanner(System.in).next();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-hh");
		Date time1=(Date)sdf.parse(time);
		Date time02=new Date(time1.getTime()+1000*60*60*7);
		Date time03=new Date(time1.getTime()+1000*60*60*12);
		String time2=sdf.format(time02);
		String time3=sdf.format(time03);
		System.out.println("此刻的巴黎时间是："+time2);
		System.out.println("此刻的纽约时间是："+time3);
	}
}
