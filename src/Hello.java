
public class Hello 
{
	public static  void main(String[] args) 
	{
		teacher b=new teacher(222);
		student a=new student(111,b);
		a.printID();
	}
}

class student
{
	int ID;
	teacher t;
	student(int ID)
	{
		this.ID=ID;
	}
	student(teacher t)
	{
		this.t=t;
	}
	student(int ID,teacher t)
	{
		this.ID=ID;
		this.t=t;
	}
	void setteacher()
	{
		this.t=t;
	}
	void printID()
	{
		System.out.println(ID);
	}
	void study()
	{
		t.teach();
	} 
}

class teacher
{
	student s;
	int ID;
	teacher(student s)
	{
		this.s=s;
	}
	teacher(int ID)
	{
		this.ID=ID;
	}
	teacher(int ID,student s)
	{
		this.ID=ID;
		this.s=s;
	}
	void setstudent()
	{
		this.s=s;
	}
	void teach()
	{
		s.printID();
	}
}