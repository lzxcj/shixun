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
		System.out.println("���õ�������"+energy);
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
		System.out.println("�����������Ϊ"+age);
	}
}