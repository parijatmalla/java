package cs520.module4.L3_collections;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;

public class P06_MapsDemo {
	
	public static void main(String[] args)
	{
		// Create an empty hash map
		HashMap<String, Integer> salaryMap = 
			new HashMap<String, Integer>();
		
		// Put entries and values in the hash map
		salaryMap.put("Alice", 50000);
		System.out.println("Map: " + salaryMap);
		salaryMap.put("Bob", 60000);
		System.out.println("Map: " + salaryMap);
		salaryMap.put("Charlie", 70000);
		System.out.println("Map: " + salaryMap);
		salaryMap.put("Dave", 80000);
		System.out.println("Map: " + salaryMap);
		
		// Lookup Bob's Salary
		Integer salary = salaryMap.get("Bob");
		System.out.printf("Bob's Salary is $%d\n", salary);
		
		// Give Bob a 10% raise
		int newSalary = (int)(salary + 0.1 * salary);
		salary = salaryMap.put("Bob", newSalary);
		System.out.printf(
				"Bob's new salary $%d replaces old salary $%d\n",
				newSalary, salary);
		System.out.println("Map: " + salaryMap);
				
		// Check if a key is there in the map
		if (salaryMap.containsKey("Charlie"))
			System.out.println("Charlie's entry is in the map");
		else
			System.out.println("Charlie's entry is not in the map");
	
		if (salaryMap.containsKey("Ed"))
			System.out.println("Ed's entry is in the map");
		else
			System.out.println("Ed's entry is not in the map");
		
		// Access all the keys in the map
		Set<String> nameKeys = salaryMap.keySet();
		
		// Iterate over keys in the map
		Iterator<String> nameIterator = nameKeys.iterator();
		while (nameIterator.hasNext())
		{
			String name = nameIterator.next();
			System.out.printf("-- %8s's Salary is $%d\n", 
					name, salaryMap.get(name));
		}	
		
		// Access all the values in the map
		Collection<Integer> salaries = salaryMap.values();
		Iterator<Integer> salaryIterator = salaries.iterator();
		while (salaryIterator.hasNext())
		{
			Integer value = salaryIterator.next();
			System.out.printf("-- Someone's Salary is $%d\n", 
					value);
		}	
		
		// Remove a key from the map
		salary = salaryMap.remove("Bob");
		System.out.printf(
				"Bob's entry with salary %d is removed\n", 
				salary);
		System.out.println("Map: " + salaryMap);
		
		// Iteration using the for-each construct
		for (String key : nameKeys)
		{
			System.out.printf("-- %8s's Salary is $%d\n", 
					key, salaryMap.get(key));
		}
		
		System.out.println(salaryMap.entrySet().toArray()[0].getClass());
	}
}
