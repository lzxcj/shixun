package shixun4;

public class Homework3 
{
	public static void main(String[] args)
	{
		YouThread y=new YouThread();
		HeThread h=new HeThread();
		y.setPriority(Thread.NORM_PRIORITY+5);
		h.setPriority(Thread.NORM_PRIORITY+1);
		System.out.println(y.getPriority());
		System.out.println(h.getPriority());
		y.start();
		h.start();
	}
}
class YouThread extends Thread
{
	public void run()
	{
		int num=0;
		while(num<200)
		{
			System.out.println("�߳�һ�������е�"+num+"��");
			num++;
		}
	}
}
class HeThread extends Thread
{
	public void run()
	{
		int num=0;
		while(num<200)
		{
			System.out.println("�̶߳���������"+num+"��");
			num++;
		}
	}
}