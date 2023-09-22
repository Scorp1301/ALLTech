package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class StudentTest {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
		
		try {
			tx.begin();
			Course course = new Course(2, "c++", 1500);
			Student student = new Student(3, "fghj", 2, course);
//			session.save(course);
//			session.save(student);
			session.persist(student);
			tx.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}

}
