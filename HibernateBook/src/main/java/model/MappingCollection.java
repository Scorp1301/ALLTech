package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class MappingCollection {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Friend friend = new Friend("rock", "rock@gmail.com");
		
		friend.getNicknames().add("Ronny");
		friend.getNicknames().add("Randy");
		friend.getNicknames().add("rock");
		session.persist(friend);
		
		session.getTransaction().commit();
		session.close();
	}

}
