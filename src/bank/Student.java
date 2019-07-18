package bank;
import java.util.Scanner;
public class Student 
{
	public static void main(String args[]) 
	{
		Stu a = new Stu();
		int k = new Scanner(System.in).nextInt();
		Course m= new Course();;
		a.name="李泽";
		a.GPA=0;
		a.setGPA(k);
		int i;
		for(i=0;i<30;i++)
			{
			a.study(m);
			}
		a.printInfor();
	}
}
class Stu
{
	String name;
	double GPA;
	Course list[]=new Course[30];
	void init()
	{
		list[0]=new Course();
		list[1]=new Course();
		list[0].classname="高等数学";
		list[1].classname="线性代数";
	}
	void study(Course c)
	{
		c.score++;
		list[0]=c;
		GPA++;
	}
	void printInfor()
	{
		System.out.println(name+"你的成绩为"+GPA);
	}
	void setGPA(int GPA)
	{
		this.GPA=GPA;
	}
}
class Course
{
	String classname;
	double score;
}