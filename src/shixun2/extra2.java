package shixun2;
import java.util.*;
public class extra2 
{
	public static void main(String[] args)
	{
		System.out.println("�����뵥�ʣ����ʼ��ö��ŷֿ�");
		String a=new Scanner(System.in).next();
		List<String> l=Arrays.asList(a.split(","));
		for(int i=0;i<l.size();i++)
		{
			for(int j=0;j<i;j++)
			{
				if((((String) l.get(i)).compareTo((String) l.get(j)))<0)
				{
					String k=(String) l.get(i);
					l.set(i, l.get(j));
					l.set(j, k);
				}
					
			}
		}
		System.out.println("�����ĵ���Ϊ"+l);
	}
}
