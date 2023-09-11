package ArrayListDemo;

import java.util.Set;
import java.util.TreeSet;

public class ComparableTest {
	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<Employee>();
		
		set.add(new Employee(13, "Nirav"));
		set.add(new Employee(10000, "Njhwef"));
		set.add(new Employee(143, "wjhsidu"));
		set.add(new Employee(1003, "Nirav"));
		
		for (Employee employee : set) {
			System.out.println("Employee id:" +employee.id);
			System.out.println("Employee name:" + employee.name);
		}
		
		
	}

}
