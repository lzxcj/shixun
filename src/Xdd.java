import java.util.*;
public class Xdd {
    public static void main(String[] args) {
    	/*Vector<Integer> v= new Vector<Integer>();
    	v.add(1);
    	v.add(2);
    	System.out.println(v.get(1));
    	Object obj=new Object();
    	Integer OO=(Integer)  obj;*/
    	
    	/*String a ="��ǿ";
    	String b=new String("��ǿ");
    	if(a==b)
    		System.out.println("��ǿ�ǌ���");
    	if(a.equals(b))
    		System.out.println("��ǿ");*/
    	try 
    	{
	    	int a=new Scanner(System.in).nextInt();
	    	System.out.println("С��ǿ");
	    	System.out.println("��ǿ");    	
    	}
    	catch(InputMismatchException b)
    	{
    		System.out.println("���ϣ��ⶼ�����");
    		b.printStackTrace();
    		throw b;
    	}
    	catch(Exception c)
    	{
    		System.out.println("��");
    		
    	}
    }
}
