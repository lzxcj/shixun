package shixun4;
public class Testsync implements Runnable
{
	Timer timer=new Timer();
	public static void main(String[] args)
	{
		Testsync test=new Testsync();
		Thread t1=new Thread(test);
		Thread t2=new Thread(test);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
	public void run()
	{
		timer.add(Thread.currentThread().getName());
	}
}
