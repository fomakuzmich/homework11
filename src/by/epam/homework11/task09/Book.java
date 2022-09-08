package by.epam.homework11.task09;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static int idCounter = 0;
	
	private int id;
	private String name;
	private String autors;
	private String publishing;
	private int year;
	private int pages;
	private int price;
	private Cover binding;
	
	
	public Book(String name, String autors, String publishing, int year, int pages, int price, boolean binding) {
		this.id = this.generateID(++idCounter, year, pages);
		this.name = name;
		this.autors = autors;
		this.publishing = publishing;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.binding = new Cover(binding);
	}

	public Book() {
		this.id = this.generateID(++idCounter, 0, 0);
		this.name = "No name";
		this.autors = "Unknown";
		this.publishing = "Unknown";
		this.year = 0;
		this.pages = 0;
		this.price = 0;
		this.binding = new Cover();
	}
	
	public int generateID(int idCounter, int year, int pages) {
		int id = idCounter * 10000000 + year * 1000 + pages;
		return id;
	}
	
	



	public void setName(String name) {
		this.name = name;
	}

	public void setAutors(String autors) {
		this.autors = autors;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBinding(boolean binding) {
		this.binding = new Cover(binding);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAutors() {
		return autors;
	}

	public String getPublishing() {
		return publishing;
	}

	public int getYear() {
		return year;
	}

	public int getPages() {
		return pages;
	}

	public int getPrice() {
		return price;
	}

	public Cover getBinding() {
		return binding;
	}
	
	
	public static void booksAfterYear(Book[] books, int year) {
		for (Book x : books) {
			if (x.getYear() >= year) {
				System.out.println(x);
			}
		}
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(autors, binding, id, name, pages, price, publishing, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(autors, other.autors) && Objects.equals(binding, other.binding) && id == other.id
				&& Objects.equals(name, other.name) && pages == other.pages
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publishing, other.publishing) && year == other.year;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", autors=" + autors + ", publishing=" + publishing + ", year="
				+ year + ", pages=" + pages + ", price=" + price + ", binding=" + binding + "]";
	}
	
	

}
