package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Book;
import com.example.demo.services.BookService;
@RestController
public class BookController {
	@Autowired
	BookService service;

	@RequestMapping(value="/books/",method = RequestMethod.GET)
	public List<Book> getProducts()
	{
		return service.getAll();
		
	}
	@RequestMapping(value="/books/",method = RequestMethod.POST)
	public Book createBook(@RequestBody Book book)
	{
		return service.create(book);
		
	}
	@RequestMapping(value="/books/{id}",method = RequestMethod.GET)
	public Book findBook(@PathVariable("id") int id)
	{
		return service.getBook(id);
		
	}
	@RequestMapping(value="/books/{id}",method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id)
	{
		service.deleteBook(id);
		
	}
	
	@RequestMapping(value = "/books/", method = RequestMethod.PUT)
	public Book updateProduct(@RequestBody Book book) {
		return service.updateBook(book);
	}
	
}
