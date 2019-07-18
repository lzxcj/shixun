package Companydaka;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
//import java.util.Vector;
public class Main 
{
	DaKaInfo dk;
	Company com;
	public static void main(String[] args)
	{
		DaKaInfo dk=new DaKaInfo();
		Company com=new Company();
		boolean flag=true;
		while(flag) {
			System.out.println("请输入要添加的员工工号");
			int ID=new Scanner(System.in).nextInt();
			System.out.println("请输入要添加的员工姓名");
			String name=new Scanner(System.in).next();
			Employee temp=new Employee(ID,name);
			com.add(temp);
			System.out.println("继续添加请按1");
			System.out.println("终止添加请按2");
			int a=new Scanner(System.in).nextInt();
			if(a==1)
			{
				flag=true;
			}
			if(a==2)
			{
				flag=false;
			}
		}
		System.out.println("添加信息成功");
		boolean flag1=true;
		while(flag1) 
		{
			System.out.println("----员工打卡系统----");
			System.out.println("输入 0-----退出");
			System.out.println("输入 1-----签到");
			System.out.println("输入 2-----签退");
			System.out.println("输入 3-----查看签到信息");
			System.out.println("请输入想执行的操作：");
			int cmd=new Scanner(System.in).nextInt();
			switch(cmd)
			{
			case 0:flag1=false;break;
			case 1:
				System.out.println("请输入签到员工ID：");
				int ID0=new Scanner(System.in).nextInt();
				for(int i=0;i<com.emp.size();i++)
				{
					Employee temp=new Employee();
					if(ID0==((Employee)com.emp.get(i)).getID())
					{
						if((com.dakainfor.get(ID0))!=null)
						{
							System.out.println("今天已经打过卡了");
							break;
						}
						else
						{
							temp=(Employee)com.emp.get(i);
							Object a=dk.punch(temp.getID());
							String s0=a.toString();
							String s=temp.toString();
							String s3=s+"\n"+s0;							
							com.dakainfor.put(ID0, s3);
							break;
						}
					}
				}break;
			case 2:
				System.out.println("请输入签到员工ID：");
				int ID1=new Scanner(System.in).nextInt();
				for(int i=0;i<com.emp.size();i++)
				{
					Employee temp=new Employee();
					if(ID1==((Employee)com.emp.get(i)).getID())
					{
						if((com.dakainfor.get(ID1))!=null)
						{
							temp=(Employee)com.emp.get(i);
							dk.signout(temp.getID());
							Object a=com.dakainfor.get(ID1);
							String s=a.toString();
							Object b=dk.signout(temp.getID());
							String s1=b.toString();
							String s2=s+"\n"+s1;
							com.dakainfor.put(ID1, s2);
						}
						else
						{
							System.out.println("卡号："+ID1+"今天还没有签到，无法签退");
						}
					}
				}
				
				break;
			case 3:
				try {
					File f=new File("d:/io/clockin.txt");
					FileWriter fw=new FileWriter(f);
					for(int i=0;i<com.emp.size();i++)
					{
						String str=com.dakainfor.get((((Employee)com.emp.get(i)).getID())).toString();
						fw.write(str+"\n");
						if(str.length()<40)
						{
							fw.write("签退时间：无记录");
						}
					}
					fw.close();
					FileReader fr=new FileReader(f);
					char[] ch=new char[5000];
					int len=fr.read(ch);
					String k=new String(ch,0,len);
					System.out.println(k);
					fr.close();
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				}finally {}
				break;			
			}
		}
	}
}
	
