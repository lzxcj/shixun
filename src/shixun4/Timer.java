package shixun4;

public class Timer 
{
	public static int num=0;
	public void add(String name)
	{
		synchronized(this) {
			num++;
			try {
				Thread.sleep(1);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(name+"���ǵ�"+num+"��ʹ��Timer���߳�");
	}
}
