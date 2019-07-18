package shixun;

public class extra4 
{
	public static void main(String[] args)
	{
		String a="1s1中111sss中中中1";
		char[] ch=a.toCharArray();
		int count1=0;
		int count2=0;
		int count3=0;
		for(int i=0;i<a.length();i++)
		{
			if(ch[i]=='1')
			{
				count1++;
			}
			if(ch[i]=='s')
			{
				count2++;
			}
			if(ch[i]=='中')
			{
				count3++;
			}
		}
		System.out.println("1的个数为"+count1);
		System.out.println("s的个数为"+count2);
		System.out.println("中的个数为"+count3);
	}
}
