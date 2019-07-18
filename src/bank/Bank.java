package bank;
import java.util.*;
import java.util.Scanner;
public class Bank
{
	public static void main(String[] args)
	{
		Employee e = new Employee();
		while (true)
		{
			System.out.println("***********");
			System.out.println("管理员\t1");
			System.out.println("用户\t2");
			System.out.println("退出\t0");
			System.out.println("***********");
			int cmd = new Scanner(System.in).nextInt();
			switch (cmd)
			{
			case 1:e.run();break;
			case 2:
					System.out.println("请输入您的账号");
					int ID = new Scanner(System.in).nextInt();
					for (int i = 0; i < e.v.size() ;i++ )
					{
						Cust temp = (Cust)e.v.get(i);
						if (ID == temp.getID())
						{
							temp.run();
						}	
					}
					break;
			case 0:return;
			}
		}
	}
}


class Employee 
{
	private int id=666;
	private int password0=123456;
	Vector v = new Vector();
	Employee()
	{}
	void add()
	{
		System.out.println("请输入要添加客户的姓名");
		String name = new Scanner(System.in).next();
		System.out.println("请输入要添加客户的用户名");
		int ID = new Scanner(System.in).nextInt();
		System.out.println("请输入要添加客户的开户金额");
		int money = new Scanner(System.in).nextInt();
		System.out.println("请输入要添加客户的密码");
		int password = new Scanner(System.in).nextInt();
		v.add(new Cust(name,ID,money,password));
	}

	void delete()
	{
		System.out.println("请输入你要删除的用户ID");
		int k=new Scanner(System.in).nextInt();
		for(int i=0;i<v.size();i++)
		{
			if(((Cust)v.get(i)).getID()==k)
			{
				v.remove(i);
				System.out.println("删除成功");
			}
		}
	}

	void sort()
	{
		Collections.sort(v, new cmp());
	}


	void search()
	{
		System.out.println("请输入用户的ID");
		int a=new Scanner(System.in).nextInt();
		for(int i=0;i<v.size();i++)
		{
			if (((Cust)v.get(i)).getID()==a)
				System.out.println(((Cust)v.get(i)).getName()+"\t"+"现有存款"+((Cust)v.get(i)).getMoney()+"\t");
		}	
			
	}

	void run()
	{
		int b=0;
		int a;
		do 
		{	
			System.out.println("请输入管理员密码");
			a=new Scanner(System.in).nextInt();
			if(b>=2)
			{
				System.out.println("对不起，您输入密码的次数用光");
				System.exit(0);
			}
			if(a!=password0 && b<2) 
			{
				System.out.println("密码错误，请重新输入");
				b+=1;
			}
		}
		while(a != password0);
		if(password0==a)
		{
			System.out.println(id+"管理员欢迎你的使用");
		}
		boolean flag = true;
		while (flag)
		{
			System.out.println("**********************");
			System.out.println("添加客户\t1");
			System.out.println("删除客户\t2");
			System.out.println("查询客户\t3");
			System.out.println("退出\t\t0");
			System.out.println("**********************");
			int cmd1 = new Scanner(System.in).nextInt();
			switch (cmd1)
			{
			case 1:this.add();break;
			case 2:this.delete();break;
			case 3:this.search();break;
			case 0:flag = false;break;
			}
		}
	}
}
class Cust
{
	private String name;
	private int ID;
	private double money;
	private int password;
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
	
	public int getPassword()
	{
		return password;
	}
	
	public void setName(String newname)
	{
		this.name=newname;
	}
	
	public void setID(int newID)
	{
		this.ID=newID;
	}
	
	public void setMoney(double newmoney)
	{
		this.money=newmoney;
	}
	
	public void setPassword(int newpassword)
	{
		this.password=newpassword;
	}
	Cust(){}
	Cust(String name,int ID,double money,int password)
	{
		this.name = name;
		this.ID = ID;
		this.money = money;
		this.password = password;
	}

	void deposite()
	{
		System.out.println("请输入您要存款的金额");
		int temp = new Scanner(System.in).nextInt();
		money+=temp;
	}
	
	void draw()
	{
		System.out.println("请输入您要取款的金额");
		int temp = new Scanner(System.in).nextInt();
		if (temp>money)
		{
			System.out.println("不能透支");
		}
		else
		{
			money-=temp;
		}
	}
	
	private void printInfor()
	{
		System.out.println(ID+"您的账户还有"+money+"元");
	}
	
	void run()
	{
		System.out.println("请输入你的密码");
		int b=0;
		int a;
		do 
		{
			a=new Scanner(System.in).nextInt();
			if(b>=2)
			{
				System.out.println("对不起，您输入密码的次数用光");
				System.out.println("您的账号已被冻结");
			}
			if(a!=password && b<2) 
			{
				System.out.println("密码错误，请重新输入");
				b+=1;
			}
		}
		while(a != password);
		if (b>2)
			System.exit(0);
		if (a==password && b<2)
			System.out.println("密码正确，欢迎使用");
		boolean flag = true;
		while (flag)
		{
			System.out.println("***********");
			System.out.println("取款\t1");
			System.out.println("存款\t2");
			System.out.println("查询\t3");
			System.out.println("退出\t0");
			System.out.println("***********");
			int cmd1 = new Scanner(System.in).nextInt();
			switch (cmd1)
			{
			case 1:this.draw();break;
			case 2:this.deposite();break;
			case 3:this.printInfor();;break;
			case 0:flag = false;break;
			}
		}
	}
}

class VIPCust extends Cust
{
	private String name;
	private int ID;
	private double money;
	private int password;
	VIPCust(String name,int ID,double money,int password)
	{
		this.name = name;
		this.ID = ID;
		this.money = money;
		this.password = password;
	}
	void printInfor()
	{
		System.out.println(name+"的账户还有"+money+"元");
	}
	void draw()
	{
		System.out.println("请输入您要取款的金额");
		int temp = new Scanner(System.in).nextInt();
		if (temp-20000>money)
		{
			System.out.println("不能透支超过两万");
		}
		else
		{
			money-=temp;
		}
	}
}
class cmp implements Comparator<Cust> {
    public int compare(Cust a, Cust b) {
        if(a.getMoney() < b.getMoney()){
            return -1;
        }else if(a.getMoney() == b.getMoney()){
            return 0;
        }else{
            return 1;
        }
    }
}