package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class CustomerTest {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
		
		try {
			tx.begin();
			Passport passport = new Passport("1313r53");
			Customer cust = new Customer("John", passport);
			session.persist(cust);
			
		} catch (Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}

}
