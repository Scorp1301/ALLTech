package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class EmployeeTest {
	public static void main(String[] args) {
		//Employee e1 = new Employee(0, null, null)
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx = session.getTransaction();
		
		try {
			tx.begin();
			Address a = new Address("wdf", "LB", 90815);
			Employee1 e = new Employee1(1, "John", a);
			session.save(e);
			tx.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
	}

}
