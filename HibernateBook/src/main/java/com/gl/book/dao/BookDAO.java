package com.gl.book.dao;

import java.util.List;

import model.Book;

public interface BookDAO {
	
	void create();
	void update(int id);
	void delete(int id);
	public List<Book> read();
	void readAll();

}
