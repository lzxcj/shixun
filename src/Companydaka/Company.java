package Companydaka;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Company 
{
	List emp=new ArrayList();
	Map dakainfor=new HashMap();
	void add(Employee p)
	{
		emp.add(p);
		System.out.println("添加成功！");
	}
	void delete()
	{
		System.out.println("请输入要删除员工的ID");
		int ID=new Scanner(System.in).nextInt();
		emp.remove(ID);
		System.out.println("删除成功！");
	}
	void search()
	{
		System.out.println("请输入要查找员工的ID");
		int ID=new Scanner(System.in).nextInt();
		if(emp.get(ID)!=null)
		{
			System.out.println("公司有这个员工");
		}else {
			System.out.println("公司没有这个员工");
		}
		System.out.println("查找成功");
	}
	void printInfor()
	{
		System.out.println("请输入要查找员工的ID");
		int ID=new Scanner(System.in).nextInt();
		System.out.println("这是"+ID+"员工的信息"+((Employee)emp.get(ID)).toString());
	}
	
}
