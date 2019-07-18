package shixun2;
import java.util.*;

public class Exception_sample_5
{
	//int[] arr=new int[3];
	public static void main(String[] args)
	{
		/*Set s=new HashSet();
		s.add("hello");
		s.add("World");
		s.add(new Name("f1","f2"));
		s.add(new Integer(100));
		s.add(new Name("f1","f2"));
		s.add("hello");
		System.out.println(s);
		List li=new ArrayList();
		li.add("one");
		li.add("two");
		li.add(3);
		li.add(new Float(4.0f));
		li.add(new Integer(3));
		li.add("two");
		System.out.println(li);*/
		/*HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<6;i++)
		{
			set.add(new Integer(i));
		}
		//获得游标
		Iterator<Integer> it=set.iterator();
		//循环遍历
		while(it.hasNext())
		{
			Integer j=(Integer)it.next();
			System.out.println(j);
		}
		System.out.println(set);*/
		/*List a=new ArrayList();
		List b=new LinkedList();
		for(int i=0;i<9;i++)
		{
			a.add(i);
			b.add(i);
		}
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			Integer j=(Integer)it.next();
			System.out.println(j);
		}
		for(int k=0;k<b.size();k++)
		{
			System.out.println(b.get(k));
		}
		System.out.println(a);*/
		/*Map m1=new HashMap();
		Map m2=new HashMap();
		m1.put("one", new Integer(1));
		m1.put("two", new Integer(2));
		m1.put("three", new Integer(3));
		System.out.println(m1);
		m2.put("A",new Integer(1));
		m2.put("B",new Integer(2));
		System.out.println(m1.size());
		System.out.println(m1.containsKey("one"));
		System.out.println(m2.containsKey(new Integer(1)));
		if(m1.containsKey("two"))
		{
			int i=((Integer)m1.get("two")).intValue();
			System.out.println(i);
		}
		System.out.println(m1);
		Map m3=new HashMap(m1);
		System.out.println(m1);
		m3.putAll(m2);
		System.out.println(m3);*/
		/*int i=0;
		String greetings[]= {"Hello World","Hello Dingdang","Hello Kitty"};
		while(i<4)
		{
			System.out.println(greetings[i]);
			i++;
		}*/
		/*try {
			int x=1;
			int y=5/x;
		}catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception");
		}catch(Exception e) {
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("program is running into finally")
		}
		System.out.println("finished");*/
		/*int numbers[]= {3,4,2,6};
		try
		{
			for(int i=0;i<numbers.length;i++)
			{
				int input=new Scanner(System.in).nextInt();
				System.out.println(numbers[i]/input);
			}
		}catch(InputMismatchException|ArithmeticException e) {
			System.out.println("输入错误");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}*/
		/*new Exception_sample_5().methodOne();
		System.out.println("main");
	}*/
	/*public void methodOne()
	{
		methodTwo();
		System.out.println("One");
	}
	public void methodTwo()
	{
		methodThree();
		System.out.println("Two");
	}
	public void methodThree()
	{
		System.out.println(arr[2]);
		System.out.println("Three");
	}*/
	try
	{
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		add(a,b);
	}catch(MyException e) {
		System.out.println("输入错误！");
	}
}
public static void add(int a,int b)throws MyException{
	if(a<0&&b<0) {
		throw new MyException();
	}else {
		System.out.println(a+b);
	}
}
}
 class MyException extends Exception{}
/*class Name
{
	Name(String s1,String s2){}
}*/