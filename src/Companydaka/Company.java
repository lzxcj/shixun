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
		System.out.println("��ӳɹ���");
	}
	void delete()
	{
		System.out.println("������Ҫɾ��Ա����ID");
		int ID=new Scanner(System.in).nextInt();
		emp.remove(ID);
		System.out.println("ɾ���ɹ���");
	}
	void search()
	{
		System.out.println("������Ҫ����Ա����ID");
		int ID=new Scanner(System.in).nextInt();
		if(emp.get(ID)!=null)
		{
			System.out.println("��˾�����Ա��");
		}else {
			System.out.println("��˾û�����Ա��");
		}
		System.out.println("���ҳɹ�");
	}
	void printInfor()
	{
		System.out.println("������Ҫ����Ա����ID");
		int ID=new Scanner(System.in).nextInt();
		System.out.println("����"+ID+"Ա������Ϣ"+((Employee)emp.get(ID)).toString());
	}
	
}
