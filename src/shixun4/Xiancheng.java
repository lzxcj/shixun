package shixun4;
public class Xiancheng
{
	private final Object flag=new Object();
	public static void main(String[] args)
	{
		Xiancheng threadTest = new Xiancheng();
		T01 t1 = threadTest.new T01();
		T02 t2 = threadTest.new T02();
		t1.start();
		t2.start();
	}
	class T01 extends Thread
	{
		public void run()	
		{
			
			synchronized(flag){
				int num=1;
				while(num<100)
				{
					flag.notify();
					System.out.println("线程一-->"+num);
					try {
						flag.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					num=num+2;
				}
			}
		}
	}
	class T02 extends Thread
	{
		public void run()
		{
			synchronized(flag){
				int num=2;
				while(num<101)
				{
					flag.notify();
					System.out.println("线程二-->"+num);
					try {
						flag.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					num=num+2;
				}
			}
		}
	}
}