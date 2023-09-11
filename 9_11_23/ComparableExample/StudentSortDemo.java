package ComparableExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentSortDemo {
	public static void main(String[] args) {
		List<Student> stu = new ArrayList<Student>();
		stu.add(new Student(1, "wudh"));
		stu.add(new Student(456, "aksm"));
		stu.add(new Student(53, "aslk"));
		stu.add(new Student(100, "feap"));
		
		for (Student student : stu) {
			System.out.println(student.toString());
		}
		Collections.sort(stu);
		for (Student student : stu) {
			System.out.println(student.toString());
		}	
	}
}
