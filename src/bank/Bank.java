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
			System.out.println("����Ա\t1");
			System.out.println("�û�\t2");
			System.out.println("�˳�\t0");
			System.out.println("***********");
			int cmd = new Scanner(System.in).nextInt();
			switch (cmd)
			{
			case 1:e.run();break;
			case 2:
					System.out.println("�����������˺�");
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
		System.out.println("������Ҫ��ӿͻ�������");
		String name = new Scanner(System.in).next();
		System.out.println("������Ҫ��ӿͻ����û���");
		int ID = new Scanner(System.in).nextInt();
		System.out.println("������Ҫ��ӿͻ��Ŀ������");
		int money = new Scanner(System.in).nextInt();
		System.out.println("������Ҫ��ӿͻ�������");
		int password = new Scanner(System.in).nextInt();
		v.add(new Cust(name,ID,money,password));
	}

	void delete()
	{
		System.out.println("��������Ҫɾ�����û�ID");
		int k=new Scanner(System.in).nextInt();
		for(int i=0;i<v.size();i++)
		{
			if(((Cust)v.get(i)).getID()==k)
			{
				v.remove(i);
				System.out.println("ɾ���ɹ�");
			}
		}
	}

	void sort()
	{
		Collections.sort(v, new cmp());
	}


	void search()
	{
		System.out.println("�������û���ID");
		int a=new Scanner(System.in).nextInt();
		for(int i=0;i<v.size();i++)
		{
			if (((Cust)v.get(i)).getID()==a)
				System.out.println(((Cust)v.get(i)).getName()+"\t"+"���д��"+((Cust)v.get(i)).getMoney()+"\t");
		}	
			
	}

	void run()
	{
		int b=0;
		int a;
		do 
		{	
			System.out.println("���������Ա����");
			a=new Scanner(System.in).nextInt();
			if(b>=2)
			{
				System.out.println("�Բ�������������Ĵ����ù�");
				System.exit(0);
			}
			if(a!=password0 && b<2) 
			{
				System.out.println("�����������������");
				b+=1;
			}
		}
		while(a != password0);
		if(password0==a)
		{
			System.out.println(id+"����Ա��ӭ���ʹ��");
		}
		boolean flag = true;
		while (flag)
		{
			System.out.println("**********************");
			System.out.println("��ӿͻ�\t1");
			System.out.println("ɾ���ͻ�\t2");
			System.out.println("��ѯ�ͻ�\t3");
			System.out.println("�˳�\t\t0");
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
		System.out.println("��������Ҫ���Ľ��");
		int temp = new Scanner(System.in).nextInt();
		money+=temp;
	}
	
	void draw()
	{
		System.out.println("��������Ҫȡ��Ľ��");
		int temp = new Scanner(System.in).nextInt();
		if (temp>money)
		{
			System.out.println("����͸֧");
		}
		else
		{
			money-=temp;
		}
	}
	
	private void printInfor()
	{
		System.out.println(ID+"�����˻�����"+money+"Ԫ");
	}
	
	void run()
	{
		System.out.println("�������������");
		int b=0;
		int a;
		do 
		{
			a=new Scanner(System.in).nextInt();
			if(b>=2)
			{
				System.out.println("�Բ�������������Ĵ����ù�");
				System.out.println("�����˺��ѱ�����");
			}
			if(a!=password && b<2) 
			{
				System.out.println("�����������������");
				b+=1;
			}
		}
		while(a != password);
		if (b>2)
			System.exit(0);
		if (a==password && b<2)
			System.out.println("������ȷ����ӭʹ��");
		boolean flag = true;
		while (flag)
		{
			System.out.println("***********");
			System.out.println("ȡ��\t1");
			System.out.println("���\t2");
			System.out.println("��ѯ\t3");
			System.out.println("�˳�\t0");
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
		System.out.println(name+"���˻�����"+money+"Ԫ");
	}
	void draw()
	{
		System.out.println("��������Ҫȡ��Ľ��");
		int temp = new Scanner(System.in).nextInt();
		if (temp-20000>money)
		{
			System.out.println("����͸֧��������");
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