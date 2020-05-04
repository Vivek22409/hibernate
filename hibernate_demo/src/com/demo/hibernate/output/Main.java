package com.demo.hibernate.output;

import java.util.List;

import com.demo.hibernate.dao.BookDao;
import com.demo.hibernate.entity.Book;

public class Main {

	public static void main(String[] args) {

		BookDao b = new BookDao();
		Book book = new Book();

		b.saveBook("terminator", "Jame", 550);

		List<Book> bt = b.getBooks();
		System.out.println(bt.get(0).getAuthor());

		book.setAuthor("Anicet");
		book.setTitle("mecanique");
		book.setPrice(600);
		book.setId(1);
		System.out.println(b.updateBook(book));

		System.out.println(b.deleteBook(2));

	}

}
