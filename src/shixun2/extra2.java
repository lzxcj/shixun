package shixun2;
import java.util.*;
public class extra2 
{
	public static void main(String[] args)
	{
		System.out.println("请输入单词，单词间用逗号分开");
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
		System.out.println("排序后的单词为"+l);
	}
}
