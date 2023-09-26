package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Book;

import com.example.demo.repository.BookRepository;
@Service
public class BookService {
	@Autowired
	BookRepository itr;
	
	//Get all the the products
	public List<Book> getAll()
	{
		return (List<Book>)itr.findAll();
	}
	
	public Book create(@RequestBody Book book) {
		return itr.save(book);
	}
	
	public Book getBook(@PathVariable("id") int id) {
		return itr.findById(id).get();
	}
	
	public void deleteBook(@PathVariable("id") int id) {
		itr.deleteById(id);
	}
	
	public Book updateBook(@RequestBody Book book) {
		return itr.save(book);
	}


}
