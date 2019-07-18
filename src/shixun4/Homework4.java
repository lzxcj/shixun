 package shixun4;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Homework4 
{
	public static void main(String[] args)
	{
		Timer1 t=new Timer1();
		t.start();
	}
}
class Timer1 extends Thread
{
	public void run()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		while(true) {
			Calendar c=Calendar.getInstance();
			String s=sdf.format(c.getTime());
			try {
				Timer1.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(s);
		}
	}
}
	