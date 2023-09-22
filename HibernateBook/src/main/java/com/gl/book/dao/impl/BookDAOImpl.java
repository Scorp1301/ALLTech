package com.gl.book.dao.impl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import com.gl.book.dao.BookDAO;

import jakarta.persistence.Query;
import jakarta.transaction.*;
import model.Book;
import util.HibernateUtil;

public class BookDAOImpl implements BookDAO {
	//private final SessionFactory sessionFactory;
	
//	public BookDAOImpl(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}
	public BookDAOImpl() {
		
	}
	//Transaction transaction;
//  try (Session session = sessionFactory.openSession()) {
//      transaction = session.beginTransaction();
//      Session.create(book);
//      transaction.commit();
//  } catch (Exception e) {
//      if (transaction != null) {
//          transaction.rollback();
//      }
//      e.printStackTrace();
//  }
	@Override
	public void create() {
	
        //try {
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Scanner sc = new Scanner(System.in);
		
//		System.out.println("Please enter the book Id:");
//		int id = sc.nextInt();
//		sc.nextLine();
		System.out.println("Please enter the book Name:");
		String name = sc.nextLine();
		System.out.println("Please enter the book Author:");
		String author = sc.nextLine();
		System.out.println("Please enter the book price:");
		double price = sc.nextDouble();
		
		Book b1 = new Book();
		//b1.setId(id);
		b1.setName(name);
		b1.setAuthor(author);
		b1.setPrice(price); 	
		b1.setPrice(sc.nextDouble());
		
		System.out.println(b1.getName());
		
		session1.beginTransaction();
		session1.persist(b1);
		//System.out.println("hi");
		session1.getTransaction().commit();
		//System.out.println("hello");
		session1.close();
		sc.close();
		
//        }catch (Exception e) {
//        	e.printStackTrace();
//     
//		}
		
	}
	public void update(int id) {
//		Session sessionUpdate = HibernateUtil.getSessionFactory().openSession();
//		sessionUpdate.beginTransaction();
//		@SuppressWarnings("deprecation")
//		Query query = sessionUpdate.createQuery("from book");
//		return query.getResultList()
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> read() {
		Session sessionRead = HibernateUtil.getSessionFactory().openSession();
		sessionRead.beginTransaction();
		@SuppressWarnings("deprecation")
		Query query = sessionRead.createQuery("from Book");
		return query.getResultList();
	}

	@Override
	public void readAll() {
		// TODO Auto-generated method stub
		
	}
	

}
