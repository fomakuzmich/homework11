package by.epam.homework11.task09;

import java.util.ArrayList;

public class BookStore {
	
	private ArrayList<Book> books;
	
		
	public BookStore(Book...books) {
		this.books = new ArrayList<Book>();
		for (Book book : books) {
			this.addBookToBooks(book);
		}
	}
	public BookStore(ArrayList<Book> books) {
		this.books = books;
	}
	public BookStore() {
		this.books = new ArrayList<Book>();
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	public void addBookToBooks(Book book) {
		this.books.add(book);
	}
	
	public ArrayList<Book> getBooksFromAutor(String autor) {
		
		ArrayList<Book> booksFromAutor = new ArrayList<>();
		
		for (Book book : this.books) {
			if (book.getAutors().equals(autor)) {
				booksFromAutor.add(book);
			}
		}
		return booksFromAutor;
	}
	
	public ArrayList<Book> getBooksFromPublishing(String publishing) {
		ArrayList<Book> booksFromPublishing = new ArrayList<>();
		
		for (Book book : this.books) {
			if (book.getPublishing().equals(publishing)) {
				booksFromPublishing.add(book);
			}
		}
		return booksFromPublishing;
	}
	
	public ArrayList<Book> getBooksAfterYear(int year) {
		ArrayList<Book> booksAfterYear = new ArrayList<>();
		
		for (Book book : this.books) {
			if (book.getYear() >= year) {
				booksAfterYear.add(book);
			}
		}
		return booksAfterYear;
	}
	
	

}
