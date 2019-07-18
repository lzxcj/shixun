
public class xx {
	public static void main(String[] args)
	{
		MB mb=new MB();
		Mp3 mp3=new Mp3();
		mb.useUSB(mp3);
	}
}
interface USB
{
	void start();
	void run();
	void stop();
}
class MB
{
	void useUSB(USB usb)
	{
		usb.start();
		usb.run();
		usb.stop();
	}
}
class Mp3 implements USB
{
	public void start()
	{
		System.out.println("mp3 start");
	}
	public void run()
	{
		System.out.println("mp3 run");
	}
	public void stop()
	{
		System.out.println("mp3 stop");
	}
}
