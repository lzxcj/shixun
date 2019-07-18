import java.util.*;

public class cj {

}
class Employee
{
	private String id;
	private String name;
	private double weeklySalary;
	Employee()
	{
	}
	public String getid()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double calculateSalary(int numberOfWeek)
	{
		double Salary;
		Salary=numberOfWeek*weeklySalary;
		return Salary;
	}
	public String toString()
	{
		String a=(Double)weeklySalary+"";
		return a+name+id;
	}
}
class Manager extends Employee
{
	private Vector v=new Vector();
	private Employee supervisedEmployee;
	Manager()
	{
	}
	public void addSupervisedEmployee(Employee employee)
	{
		this.supervisedEmployee=employee;
		v.add(supervisedEmployee);
	}
	public void removeSupervisedEmployee(String id)
	{
		
	}
	public Employee getSupervisedEmployee(String id)
	{
		return supervisedEmployee;
	}
	public Iterator getIterator()
	{
		Iterator it = v.iterator();
		return it;
	}
	public int getNumberOfSupervisedEmployee()
	{
		return v.size();
	}
}
class HumanResourceSystem
{
	HumanResourceSystem()
	{
	}
	private Employee employees;
	private Vector v1=new Vector();
	public void addEmployee(Employee employee)
	{
		this.employees=employee;
		v1.add(employees);
	}
	public void removeEmployee(String id)
	{
		for(int i=0;i<v1.size();i++)
		{
			if(((Employee)v1.get(i)).getid().equals(id))
			{
				v1.remove(i);
			}
		}
	}
	public Employee getEmployee(String id)
	{
		return employees;
	}
	public Iterator getIterator()
	{
		Iterator it = v1.iterator();
		return it;
	}
	public int  getNumberfEmployee()
	{
		return v1.size();
	}
	public void displayEmployee()
	{
		System.out.println(v1.size());
	}
}