package shixun4;

public class T1 extends Thread
{
	private boolean  timeout=false;
	public void run()
	{
		while(!timeout)
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("--t1--"+i);
			}
		}
	}
	public void stopthread()
	{
		timeout=true;
	}
}
