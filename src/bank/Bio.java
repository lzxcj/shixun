package bank;

public class Bio 
{
	public static void main(String[]args) 
	{
		Fish a=new Fish();
		a.getenergy();
		a.age=6;
	}
}
class Livebeing
{
	int energy;
	Livebeing(int energy)
	{
		this.energy=energy;
	}
	void getenergy()
	{
		System.out.println("你获得的能量："+energy);
	}
}
class Animal extends Livebeing
{
	Animal()
	{
		super(6);
	}
}
class Fish extends Animal
{
	int age;
	Fish()
	{
		super();
	}
	void printage()
	{
		System.out.println("这条鱼的年龄为"+age);
	}
}