package cs520.module4.L2_arrays;

public class Employee {
	
	private String name;
	private int salary;
	
	// Constructor
	public Employee(String name, int salary)
	{
		this.name = name;
		this.salary = salary;
	}
	// get methods (set methods not implemented)
	public String getName()
	{
		return name;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		return String.format("(%s, %s)", 
				name, salary);
	}
}
