package E3.Manager;

import java.util.*;

import E2.Book.Book;

public class BookManager {
	
	// Variables
	
	private static BookManager instance = null;
	
	private ArrayList<Book> books = new ArrayList<Book>();
	
	// Constructores
	
	public BookManager() {
		
	}
	
	// Observadores
	
	public static BookManager getInstance() {
		
		if( instance == null) {
			instance = new BookManager();
		}
		return instance;
	}
	
	public ArrayList<Book> getBooks(){
		return books;
	}
	
	// Modificadores
	
	// Metodos auxiliares
	
	public void addBook(Book book) {
		
		books.add(book);
	}

	
	
}
