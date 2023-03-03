package com.api.book.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.dao.BookRepository;
import com.api.book.entites.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	// get all books
	public List<Book> getAllBooks(){
	    List<Book> list=(List<Book>)this.bookRepository.findAll();
		return list;
	}
	
	//get single book by id
    public Book getBookById(int id){

        Book book = null;  
        try {
         book = this.bookRepository.findById(id);
        } catch (Exception e) {
          e.printStackTrace();
        }
        return book;
      }

	
	// add new book
	public Book addBook(Book b) {
		
		Book result = bookRepository.save(b);
		return result;
	}

	// delete book
	public void deleteBook(int bid) {
		
		bookRepository.deleteById(bid);
	}

	// update book
	public void updateBook(Book book, int bookId) {
		
		book.setId(bookId);
		bookRepository.save(book);
	}
}
