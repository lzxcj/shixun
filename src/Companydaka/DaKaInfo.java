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
		System.out.println("����:"+ID+" �򿨳ɹ�");
		System.out.println("��ʱ�䣺"+s);
		return "��ʱ�䣺"+s;
	}
	Object signout(int ID)
	{
		this.ID=ID;
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c1=Calendar.getInstance();
		String s1=sdf1.format(c1.getTime());
		System.out.println("����:"+ID+"ǩ�˳ɹ�");
		System.out.println("ǩ��ʱ�䣺"+s1);
		return "ǩ��ʱ�䣺"+s1;
	}
}
