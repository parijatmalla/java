package cs520.module3.L3_fileIO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable {
	
	private String 	employeeId;
	private String 	employeeName;
	private int		employeeSalary;

	public Employee(String id, String name, int salary)
	{
		this.employeeId = id;
		this.employeeName = name;
		this.employeeSalary = salary;
	}
	
	public String displayInfo() {
		return String.format(
				"Account: [Id: %s, Name: %-7s, Balance: %d]", 
				employeeId, employeeName, employeeSalary);
	}
}
