import java.util.Scanner;
import java.util.Vector;
public class DEMO 
{
	public static void main(String[] args)
	{
		COM com = new COM();
		boolean flag=true;
		while(flag)
		{
			System.out.println("注册客户请按1");
			System.out.println("顾客购买请按2");
			System.out.println("退出系统请按0");
			int cmd=new Scanner(System.in).nextInt();
			switch(cmd)
			{
			case 1:com.getCM();break;
			case 2:com.getCP();break;
			case 0:flag = false;
			}
		}
		com.getCP();
		com.printCP();
		com.kaiJiang();
		com.printMyCP();
		com.duiJiang();
		com.faJiang();
	}
}
class CP
{
	int user[] = new int[7];
	int level = 0;

	CP()
	{}

	void getCP()
	{
		for(int i = 0;i<7;i++)
		{
			System.out.println("请输入您的第"+(i+1)+"个数字");
			user[i] = new Scanner(System.in).nextInt();
			if(user[i]>=1&&user[i]<=35)
			{
				for(int j=0;j<i;j++)
				{
					if(user[i]==user[j])
					{
						i--;
						System.out.println("您输入的数字和第"+(j+1)+"个数字重复了，请重新输入");
						break;
					}
					else
					{
					}
				}
			}
			else
			{
				i--;
				System.out.println("您输入的数字越界，请输入1到35之间的整数");
			}
		}
	}

	void printCP()
	{
		System.out.println("您选择的号码是：");
		for(int i = 0;i<7;i++)
		{
			System.out.print(user[i]+" ");
		}
		System.out.println();
	}

	void duiJiang(int[] ran)
	{
		for(int i = 0;i<7;i++)
		{
			for(int j = 0;j<7;j++)
			{
				if(user[i]==ran[j])
				{
					level++;
					break;
				}
			}
		}
	}

	void faJiang()
	{
		System.out.println("您有"+level+"个号码中奖了");
		switch(level)
		{
			case 7:System.out.println("您中了500万");break;
			case 6:System.out.println("您中了50万");break;
			case 5:System.out.println("您中了5万");break;
			case 4:System.out.println("您中了500");break;
			case 3:System.out.println("您中了50");break;
			case 2:System.out.println("您中了5");break;
			case 1:System.out.println("再来一次");break;
			case 0:System.out.println("谢谢光临");break;
			default:System.out.println("程序出错");break;
		}
	}
}
class CM
{
	//CP cp[]=new CP[2];
	Vector v=new Vector();
	
	String name;
	//boolean flag = false;
	CM(String name)
	{
		this.name = name;
	}

	void getCP()
	{
		CP temp=new CP();
		temp.getCP();
		v.add(temp);
		/*int i = 0;
		for (i = 0;i<v.size() ;i++ )
		{
			System.out.println(this.name+"请您输入第"+(i+1)+"张彩票的号码");
			temp.getCP();
		}
		if (i==v.size())
		{
			//flag = true;
		}*/
	}

	void printCP()
	{
		for (int i = 0;i<v.size();i++ )
		{
			System.out.print(this.name);
			CP temp=(CP)v.get(i);
			temp.printCP();
		}
	}

	void duiJiang(int[] ran)
	{
		for (int i = 0;i<v.size() ;i++ )
		{
			CP temp=(CP)v.get(i);
			temp.duiJiang(ran);
		}
	}

	void faJiang()
	{
		for (int i = 0;i<v.size() ;i++ )
		{
			System.out.print(this.name);
			CP temp=(CP)v.get(i);
			temp.faJiang();
		}
	}
}
class COM
{
	int ran[] = new int[7];
	//CM cm[] = new CM[2];
	Vector v=new Vector();
	COM()
	{
		//cm[0]=new CM("张晓红");
		//cm[1]=new CM("张晓刚");
	}
	void getCM()
	{
		System.out.println("请输入您的姓名");
		String name=new Scanner(System.in).next();
		CM temp=new CM(name);
		v.add(temp);
	}
	void getCP()
	{
		if(v.size()==0)
		{
			System.out.println("目前没有客户");
			return;
		}
		System.out.println("请输入您的姓名");
		String name=new Scanner(System.in).next();
		for(int i=0;i<this.v.size();i++)
		{
			CM temp=(CM)this.v.get(i);
			if(temp.name.equals(name))
			{
				while(true)
				{
					temp.getCP();
					System.out.println("请问您是否再买一次,退出请按0");
					int cmd1=new Scanner(System.in).nextInt();
					if(cmd1==0)
					{
						break;
					}
				}
				
			}
		}
		/*for (int i = 0;i<v.size() ;i++ )
		{
			CM temp = (CM)v.get(i);
			//if(temp.flag==false);
			{
				//temp.getCP();
			}
		}*/
		
	}

	void printCP()
	{
		for (int i = 0;i<v.size() ;i++ )
		{
			CM temp=(CM)v.get(i);
			temp.printCP();
		}
	}

	void kaiJiang()
	{
		int k = 0;
		for(int i = 0;i<7;i++)
		{
			double b = Math.random();
			ran[i] = (int)(b*35+1);
			for(int j=0;j<i;j++)
			{
				//System.out.println((k++)+":目前正在产生第"+(i+1)+"个数");
				if(ran[i]==ran[j])
				{
					i--;
					break;
				}
				else
				{
				}
			}
		}
	}

	void printMyCP()
	{
		System.out.println("中国福利彩票35选7本期中奖号码：");
		for(int i = 0;i<7;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
			}
			System.out.print(ran[i]+" ");
		}
		System.out.println();
	}

	void duiJiang()
	{
		for (int i = 0;i<v.size() ;i++ )
		{
			CM temp=(CM)v.get(i);
			temp.duiJiang(ran);
		}
	}

	void faJiang()
	{
		for (int i = 0;i<v.size() ;i++ )
		{
			CM temp=(CM)v.get(i);
			temp.faJiang();
		}
	}
}
