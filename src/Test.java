
public class Test {
	public static void main(String[] args) {
		A a=A.getA();
		A a1=A.getA();
		a.addi();
		a1.print();
		
	}
}
class A
{
	private int i=0;
	private static A a=new A();
	public static A getA()
	{
		return a;
	}
	private A()
	{
		
	}
	void geti(int i)
	{
		this.i=i;
	}
	void print()
	{
		System.out.println(this.i);
	}
	void addi()
	{
		this.i++;
	}
}