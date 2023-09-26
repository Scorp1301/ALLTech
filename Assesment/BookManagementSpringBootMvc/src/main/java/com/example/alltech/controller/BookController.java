package com.example.alltech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.alltech.entity.Book;

import com.example.alltech.repository.BookRepository;
@Controller
public class BookController {
	@Autowired
	BookRepository bookRepo;
	
	@RequestMapping("/books")
	public String home(Model model) {
		model.addAttribute("books", bookRepo.findAll());
		return "books";
	}
	
	@PostMapping("/saveBook")
	public String creatBook(@ModelAttribute("book") Book theBook) {
		bookRepo.save(theBook);
		return "redirect:/books";
	}
	
	@GetMapping("/hi")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
		return "add";
	}
	
	@GetMapping("/updatePage")
	public String displayUpdatePage(@RequestParam("id") Integer id, Model model) {
		Book book = bookRepo.getById(id);
		model.addAttribute("book" ,book);
		
		return "updatePage";
	}
	
	@RequestMapping("/updateData")
	public String updateData(@ModelAttribute("book") Book book) {
		
		
		return "books";
	}
	@PostMapping("/deleteData")
	public String deleteData(@RequestParam("id") Integer id, Model model) {
		bookRepo.deleteById(id);
		return "redirect:/books";
	}
}
