package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Book;
import com.example.demo.services.BookServices;

@RestController
public class BookController {
	@Autowired
	BookServices service;
	
	@RequestMapping(value = "/books/", method = RequestMethod.GET)
	public List<Book> getBooks(){
		return service.getAll();
	}
//	@RequestMapping(value = "/hi/", method = RequestMethod.GET)
//	public String message() {
//		return "Hello World";
				
//	}

}
