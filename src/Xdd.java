import java.util.*;
public class Xdd {
    public static void main(String[] args) {
    	/*Vector<Integer> v= new Vector<Integer>();
    	v.add(1);
    	v.add(2);
    	System.out.println(v.get(1));
    	Object obj=new Object();
    	Integer OO=(Integer)  obj;*/
    	
    	/*String a ="健强";
    	String b=new String("健强");
    	if(a==b)
    		System.out.println("健强是屌人");
    	if(a.equals(b))
    		System.out.println("健强");*/
    	try 
    	{
	    	int a=new Scanner(System.in).nextInt();
	    	System.out.println("小健强");
	    	System.out.println("大健强");    	
    	}
    	catch(InputMismatchException b)
    	{
    		System.out.println("智障，这都能输错");
    		b.printStackTrace();
    		throw b;
    	}
    	catch(Exception c)
    	{
    		System.out.println("菜");
    		
    	}
    }
}
