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
			System.out.println("ע��ͻ��밴1");
			System.out.println("�˿͹����밴2");
			System.out.println("�˳�ϵͳ�밴0");
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
			System.out.println("���������ĵ�"+(i+1)+"������");
			user[i] = new Scanner(System.in).nextInt();
			if(user[i]>=1&&user[i]<=35)
			{
				for(int j=0;j<i;j++)
				{
					if(user[i]==user[j])
					{
						i--;
						System.out.println("����������ֺ͵�"+(j+1)+"�������ظ��ˣ�����������");
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
				System.out.println("�����������Խ�磬������1��35֮�������");
			}
		}
	}

	void printCP()
	{
		System.out.println("��ѡ��ĺ����ǣ�");
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
		System.out.println("����"+level+"�������н���");
		switch(level)
		{
			case 7:System.out.println("������500��");break;
			case 6:System.out.println("������50��");break;
			case 5:System.out.println("������5��");break;
			case 4:System.out.println("������500");break;
			case 3:System.out.println("������50");break;
			case 2:System.out.println("������5");break;
			case 1:System.out.println("����һ��");break;
			case 0:System.out.println("лл����");break;
			default:System.out.println("�������");break;
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
			System.out.println(this.name+"���������"+(i+1)+"�Ų�Ʊ�ĺ���");
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
		//cm[0]=new CM("������");
		//cm[1]=new CM("������");
	}
	void getCM()
	{
		System.out.println("��������������");
		String name=new Scanner(System.in).next();
		CM temp=new CM(name);
		v.add(temp);
	}
	void getCP()
	{
		if(v.size()==0)
		{
			System.out.println("Ŀǰû�пͻ�");
			return;
		}
		System.out.println("��������������");
		String name=new Scanner(System.in).next();
		for(int i=0;i<this.v.size();i++)
		{
			CM temp=(CM)this.v.get(i);
			if(temp.name.equals(name))
			{
				while(true)
				{
					temp.getCP();
					System.out.println("�������Ƿ�����һ��,�˳��밴0");
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
				//System.out.println((k++)+":Ŀǰ���ڲ�����"+(i+1)+"����");
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
		System.out.println("�й�������Ʊ35ѡ7�����н����룺");
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
