package by.epam.homework11.task09;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookStore implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Book> books;
	
		
	public BookStore(Book...books) {
		this.books = new ArrayList<Book>();
		
		for (Book book : books) {
			this.addBookToBooks(book);
		}
	}
	public BookStore(List<Book> books) {
		this.books = books;
	}
	public BookStore() {
		this.books = new ArrayList<Book>();
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void addBookToBooks(Book book) {
		this.books.add(book);
	}
	
	public List<Book> getBooksFromAutor(String autor) {
		
		List<Book> booksFromAutor = new ArrayList<>();
		
		for (Book book : this.books) {
			if (book.getAutors().equals(autor)) {
				booksFromAutor.add(book);
			}
		}
		return booksFromAutor;
	}
	
	public List<Book> getBooksFromPublishing(String publishing) {
		List<Book> booksFromPublishing = new ArrayList<>();
		
		for (Book book : this.books) {
			if (book.getPublishing().equals(publishing)) {
				booksFromPublishing.add(book);
			}
		}
		return booksFromPublishing;
	}
	
	public List<Book> getBooksAfterYear(int year) {
		List<Book> booksAfterYear = new ArrayList<>();
		
		for (Book book : this.books) {
			if (book.getYear() >= year) {
				booksAfterYear.add(book);
			}
		}
		return booksAfterYear;
	}
	@Override
	public int hashCode() {
		return Objects.hash(books);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookStore other = (BookStore) obj;
		return Objects.equals(books, other.books);
	}
	@Override
	public String toString() {
		return "BookStore [books=" + books + "]";
	}
	
	

}
