package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookServices {
	@Autowired
	BookRepository itr;
	
	public List<Book> getAll(){
		return (List<Book>)itr.findAll();
	}

}
