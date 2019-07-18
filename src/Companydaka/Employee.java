package Companydaka;

class Employee
{
	private int ID;
	private String name;
	Employee(){}
	Employee(int ID,String name)
	{
		this.ID=ID;
		this.name=name;
	}
	public int getID()
	{
		return ID;
	}
	public void setID() {}
	public String getName()
	{
		return name;
	}
	public void setName() {}
	public String toString()
	{
		String s=(Integer)ID+"";
		return "工号为："+s+"  姓名为："+name;
	}
}
