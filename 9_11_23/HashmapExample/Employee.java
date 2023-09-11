package HashmapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Employee {
	//int empid;
	//String name;
	private HashMap<String,String> map = new HashMap<String, String>();
	
	public void setName(String empid ,String name) {
		map.put(empid, name);
	}
	
	public void printNames() {
		System.out.println(map);

	}
	
	public void getName(String key) {
		System.out.println("The name of empid" +key+ ":"+ map.get(key));
	}
	
	public void printNamesKeySet() {
		Set<String> keyset = map.keySet();
		Iterator<String> itr = keyset.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			String value = map.get(key);
			System.out.println("The name of empid" +key+ ":"+ map.get(key));
		}
		
	}
	
	public void printSize() {
		System.out.println(map.size());

	}
	public void remove(String key) {
		map.remove(key);
		System.out.println("The key and value are removed from map.");

	}
	
}
