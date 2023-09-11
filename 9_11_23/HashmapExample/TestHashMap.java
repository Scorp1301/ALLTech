package HashmapExample;

import Executive.pkg.main;

public class TestHashMap {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setName("1", "Nirav");
		emp.setName("4", "Om");
		emp.setName("3", "Jack");
		emp.setName("7", "Scorp");
		
		emp.printSize();
		emp.printNames();
		emp.getName("3");
		emp.printNamesKeySet();
		emp.remove("4");
		emp.printNames();
	}

}
