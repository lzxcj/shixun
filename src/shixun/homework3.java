package shixun;

public class homework3 
{
	public static void main(String[] args)
	{
		int ran[]=new int[10];
		for(int i=0;i<10;i++)
		{
			double b=Math.random();
			ran[i]=(int)(b*100+1);
			for(int j=0;j<i;j++)
			{
				if(ran[i]==ran[j])
				{
					i--;
					break;
				}
				if(ran[j]>ran[i])
				{
					int k=(int)ran[j];
					ran[j]=ran[i];
					ran[i]=k;
				}
			}
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(ran[i]+" ");
		}
	}
}