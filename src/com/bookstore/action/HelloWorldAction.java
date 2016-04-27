package com.bookstore.action;

import com.bookstore.dao.BookDAO;
import com.bookstore.dao.impl.BookDAOImpl;
import com.bookstore.domain.Book;
import com.bookstore.service.IHelloWorldService;

public class HelloWorldAction {
	
	private IHelloWorldService helloWorldService;

	BookDAO bookDAO;
	
	public IHelloWorldService getHelloWorldService() {
		return helloWorldService;
	}

	public void setHelloWorldService(IHelloWorldService service) {
		this.helloWorldService = service;
	}


	public String execute(){
		
		Book book = new Book();
		book.setAuthor("fuyu");
		book.setPageNum(123);
		bookDAO.save(book);
		//helloWorldService.addNew();
		return "success";
	}

	public BookDAO getBookDAO() {
		return bookDAO;
	}

	public void setBookDAO(BookDAO bookdao) {
		this.bookDAO = bookdao;
	}
	
	
	
}