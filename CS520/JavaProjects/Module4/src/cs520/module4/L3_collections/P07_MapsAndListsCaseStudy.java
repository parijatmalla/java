package cs520.module4.L3_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;

public class P07_MapsAndListsCaseStudy {
	
	public static void main(String[] args)
	{
		// Create an empty list of Employee objects
		ArrayList<Employee> employeeList = 
			new ArrayList<Employee>();
		// Create an empty map of Employee objects
		HashMap<String, Employee>   employeeMap  = 
			new HashMap<String, Employee>();
		
		// Add employee objects to the list and map
		Employee newEmployee;			
		
		newEmployee = new Employee("ID1", "Alice", 51000);
		employeeList.add(newEmployee);
		employeeMap.put("ID1", newEmployee);
		
		newEmployee = new Employee("ID2", "Bob", 52000);
		employeeList.add(newEmployee);
		employeeMap.put("ID2", newEmployee);
		
		newEmployee = new Employee("ID3", "Charlie", 53000);
		employeeList.add(newEmployee);
		employeeMap.put("ID3", newEmployee);
		
		newEmployee = new Employee("ID4", "Dave", 54000);
		employeeList.add(newEmployee);
		employeeMap.put("ID4", newEmployee);
		
		newEmployee = new Employee("ID5", "Ed", 54000);
		employeeList.add(newEmployee);
		employeeMap.put("ID5", newEmployee);
		
		System.out.println("List: " + employeeList);
		System.out.println("Map: " + employeeMap);
		
		// Lookup by id
		System.out.printf("Looking up ID2 using List: %s\n",
				findEmployeeById("ID2", employeeList));
		System.out.printf("Looking up ID2 using Map: %s\n",
				findEmployeeById("ID2", employeeMap));
	
		// Lookup by name
		System.out.printf("Looking up Bob using List: %s\n",
				findEmployeeByName("Bob", employeeList));
		System.out.printf("Looking up Bob using Map: %s\n",
				findEmployeeByName("Bob", employeeMap));
	}
	
	// Lookup employee by id from the list
	private static Employee findEmployeeById(String id, 
			ArrayList<Employee> employeeList)
	{
		Iterator<Employee> itr = employeeList.iterator();
		while (itr.hasNext())
		{
			Employee currentEmployee = itr.next();
			if (id.equals(currentEmployee.getEmployeeId()))
				return currentEmployee;
		}
		return null;
	}
	// Lookup employee by id from the map
	private static Employee findEmployeeById(String id, 
			HashMap<String, Employee> employeeMap)
	{
		return employeeMap.get(id);
	}
	// Lookup employee by name from the list
	private static Employee findEmployeeByName(String name, 
			ArrayList<Employee> employeeList)
	{
		Iterator<Employee> itr = employeeList.iterator();
		while (itr.hasNext())
		{
			Employee currentEmployee = itr.next();
			if (name.equals(currentEmployee.getEmployeeName()))
				return currentEmployee;
		}
		return null;
	}
	// Lookup employee by name from the map
	private static Employee findEmployeeByName(String name, 
			HashMap<String, Employee> employeeMap)
	{
		Collection<Employee> employees = employeeMap.values();
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext())
		{
			Employee currentEmployee = itr.next();
			if (name.equals(currentEmployee.getEmployeeName()))
				return currentEmployee;
		}
		return null;
	}
}
