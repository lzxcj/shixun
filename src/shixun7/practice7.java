package shixun7;

public class practice7
{
	public static void main(String[] args)
	{
//		System.out.println(sum(100));
		int[] array= {2,3,4,5,1,5,2,9,5,6,8,3,1};
//		System.out.println(rank(array,0,array.length-1));
		for(int i=0;i<=bubblesort(array,0,array.length-1).length-1;i++)
		{
			System.out.print(bubblesort(array,0,array.length-1)[i]+" ");
		}
	}
	public static int sum(int n)
	{
		if(n==1)
		{
			return 1;
		}else {
			return sum(n-1)+n;
		}
	}
	public static int rank(int[] array,int a,int b)
	{
		if(array[a]>array[b])
		{
			return rank(array,a,b-1);
		}
		else if(array[a]<array[b])
		{
			int k=array[b];
			array[b]=array[a];
			array[a]=k;
			return rank(array,a,b-1);
		}else {
			return array[a];
		}
	}
	public static int[] bubblesort(int[] array,int a,int b)
	{
		if(a<b)
		{
			for(int i=a;i<b;i++)
			{
				if(array[i]>array[i+1])
				{
					int k=array[i+1];
					array[i+1]=array[i];
					array[i]=k;
				}
			}
			return bubblesort(array,a,b-1);
		}else {
			return array;
		}
	}
}
