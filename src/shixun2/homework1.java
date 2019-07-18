package shixun2;
import java.util.*;
public class homework1
{
	LinkedList l=new LinkedList();
	void put(Object o)
	{
		l.addLast(o);
	}
	Object get()
	{
		System.out.println("请输入你要取出的对象");
		Object a=new Scanner(System.in).next();
		l.remove(a);
		return a;
	}
	boolean isEmpty()
	{
		if(l.isEmpty()==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
