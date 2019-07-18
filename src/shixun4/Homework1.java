package shixun4;

public class Homework1 
{
	public static void main(String[] args)
	{
		System.out.println("这些素数是：");
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		MyThread3 t3=new MyThread3();
		t1.start();
		t2.start();
		t3.start();
	}
}
class MyThread1 extends Thread
{
	int num1=0;
	public void run()
	{
		for(int i=2;i<1001;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println("线程一:-->"+i);
				num1++;
			}
		}
		System.out.println(num1);
	}
}
class MyThread2 extends Thread
{
	int num1=0;
	public void run()
	{
		for(int i=1001;i<2001;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println("线程二:-->"+i);
				num1++;
			}
		}
		System.out.println(num1);
	}
}
class MyThread3 extends Thread
{
	int num1=0;
	public void run()
	{
		boolean flag=true;
		for(int i=2001;i<3001;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println("线程三 :-->"+i);
				num1++;
			}
		}
		System.out.println(num1);
	}
}
