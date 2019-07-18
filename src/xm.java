
public class xm {
	public static void main(String[]args)
	{
		A0 a=new A1();
		a.q();
		
		
	}

}
class User
{
	private A0 aaa;
	void setAaa(    A0 aaa)
	{
		this.aaa=aaa;
	}
	void invoke()
	{
		aaa.q();
	}
}
interface A0
{
	void q();
}
class A1 implements A0
{
	public void q()
	{
		System.out.println("1");
	}
}
class A2 implements A0
{
	public void q()
	{
		System.out.println("2");
	}
}
class A3 implements A0
{
	public void q()
	{
		System.out.println("3");
	}
}