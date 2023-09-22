package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.EmployeeDAO;

public class EmployeeTest {
	public static void main(String[] args) {
		try(Session session = HibernateUtil.buildSessionFactory().openSession()){
		
		session.beginTransaction();
		org.hibernate.Transaction transaction = session.beginTransaction();
		EmployeeDAO emp1 = new EmployeeDAO(1l, "John", 25, 123456);
		EmployeeDAO emp2 = new EmployeeDAO(2l, "scorp", 45, 127546);
		
		session.persist(emp1);
		session.persist(emp2);
		
		session.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		}
	}

