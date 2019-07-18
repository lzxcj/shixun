package shixun4;

public class Homework2
{
	public static void main(String[] args)
	{
		System.out.println("这些素数是：");
		Run1 r1=new Run1();
		Run2 r2=new Run2();
		Run3 r3=new Run3();
		new Thread(r1).start();
		new Thread(r2).start();
		new Thread(r3).start();
	}
}
class Run1 implements Runnable
{
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
			}
		}
	}
}
class Run2 implements Runnable
{
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
			}
		}
	}
}
class Run3 implements Runnable
{
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
			}
		}
	}
}