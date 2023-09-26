package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;

	@RequestMapping(value="/products/",method = RequestMethod.GET)
	public List<Product> getProducts()
	{
		return service.getAll();
		
	}
}
