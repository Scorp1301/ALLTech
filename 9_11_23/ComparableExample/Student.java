package ComparableExample;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		
		return "Roll No:" + rollNo + ", Name: "+ name;
	}

	@Override
	public int compareTo(Student o) {
		String name = this.name;
		int rollNo2 = o.rollNo;
		
		if(rollNo<rollNo2) {
			return -1;
		}
		if(rollNo>rollNo2) {
			return 1;
		}
		else {
 		return 0;
		}
	}
}
