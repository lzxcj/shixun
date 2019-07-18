package shixun2;
import java.util.*;
public class extra1
{
	public static void main(String[] args)
	{
		Customer c1=new Customer("a",1,100);
		Customer c2=new Customer("b",2,300);
		Customer c3=new Customer("c",3,200);
		Map mp=new HashMap();
		mp.put(c1.getID(),c1);
		mp.put(c2.getID(),c2);
		mp.put(c3.getID(),c3);
		System.out.println("请输入你要查找的用户ID");
		int id=new Scanner(System.in).nextInt();
		Customer temp=(Customer)mp.get(id);
		temp.print();
	}
	
}
class Customer
{
	private String name;
	private int ID;
	private double money;
	Customer(String name,int ID,double money)
	{
		this.name=name;
		this.ID=ID;
		this.money=money;
	}
	void print()
	{
		System.out.println("您的余额为"+money);
	}
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return ID;
	}
	public double getMoney()
	{
		return money;
	}
	public void setName()
	{
		
	}
	public void setID()
	{
		
	}
	public void setMoney()
	{
		
	}
}