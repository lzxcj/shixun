package shixun2;
import java.util.*;
public class homework3
{
	public static void main(String[] args)
	{
		List<String> l=new LinkedList<>();
		l.add("apple");
		l.add("grape");
		l.add("banana");
		l.add("pear");
		for(int i=0;i<l.size();i++)
		{
			for(int j=0;j<i;j++)
			{
				if((l.get(i)).compareTo(l.get(j))<0)
				{
					String k=l.get(i);
					l.set(i, l.get(j));
					l.set(j, k);
				}
			}
		}
		System.out.println("最大元素是："+l.get(3));
		System.out.println("最小元素是："+l.get(0));
		System.out.println(l);
	}
}
