package domain;

public class EmployeeDAO {
	Long id;
	String name;
	int age;
	int salary;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param salary
	 */
	public EmployeeDAO(Long id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "The Employee id is:" +id+ ",name :" +name+ ", Age" +age+ ", salary" + salary;
	}

}
