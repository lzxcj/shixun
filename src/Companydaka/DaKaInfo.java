package Companydaka;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.text.*;
public class DaKaInfo 
{
	public int ID;
	public Date punchtime;
	public Date signouttime;
	Company com;
	Employee employ=new Employee();
	Object punch(int ID)
	{
		this.ID=ID;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c=Calendar.getInstance();
		String s=sdf.format(c.getTime());
		System.out.println("卡号:"+ID+" 打卡成功");
		System.out.println("打卡时间："+s);
		return "打卡时间："+s;
	}
	Object signout(int ID)
	{
		this.ID=ID;
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c1=Calendar.getInstance();
		String s1=sdf1.format(c1.getTime());
		System.out.println("卡号:"+ID+"签退成功");
		System.out.println("签退时间："+s1);
		return "签退时间："+s1;
	}
}
