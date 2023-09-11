package ArrayListDemo;

public class Employee implements Comparable<Employee> {
	
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int compareTo(Employee o) {
		
		String name = this.name;
		int id2 = o.id;
		
		if(id<id2) {
			return -1;
		}
		if(id>id2) {
			return 1;
		}
		else {
		return id;
		}
		
	}

}
