import java.util.Scanner;

public class shixun6
{
	public static void main(String[] args)
	{
		 int[] ran= {6,1,6,9,78,87,23,2,26,24,25,26,22227,36,3,5,6,8,12,6,69};
		 int[] ran1= {1,3,5,6,7,8,9,12,45,46,78,79,89,96};
		 System.out.println("请输入你要查找的数");
		 int a=new Scanner(System.in).nextInt();
		 int left=0;
		 int right=ran1.length-1;
		 while(left<=right)
		 {
			 int mid=(left+right)/2;
			 if(a>ran1[mid])
			 {
				left=mid+1;
			 }
			 else if(a<ran1[mid])
			 {
				right=mid-1;
			 }
			 else
			 {
				 System.out.println("这个数在第"+mid+"位上");
				 break;
			 }
		 }
//		 for(int i=0;i<ran.length;i++)
//			 for(int j=0;j<ran.length-(i+1);j++)
//			 {
//				 if(ran[j]>ran[j+1])
//				 {
//					 int k=ran[j];
//					 ran[j]=ran[j+1];
//					 ran[j+1]=k;
//				 }
//			 }
//		 for(int i=0;i<ran.length;i++)
//		 {
//			 System.out.print(ran[i]+" ");
//		 }
//		 for(int i=0;i<ran.length;i++)
//		 {
//			 int temp=ran[i];
//			 for(int j = i-1;j>=0;j--)
//			 {
//				 if(temp<ran[j])
//				 {
//					 ran[j+1]=ran[j];
//					 ran[j]=temp;
//				 }
//			 }
//		 }
//		 for(int i=0;i<ran.length;i++)
//		 {
//			 System.out.print(ran[i]+" ");
//		 }
		 
	}		
}
