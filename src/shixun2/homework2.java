package shixun2;
import java.util.*;
public class homework2 
{
	public static void main(String[] args)
	{
		List l=new ArrayList();
		for(int i=0;i<5;i++)
		{
			l.add(i+1);
		}
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Integer j=(Integer)(it.next());
			System.out.println(j);
		}
	}
}
