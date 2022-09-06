package by.epam.homework11.task09;

public class Book {
	
	private static int idCounter = 0;
	
	private int id;
	private String name;
	private String autors;
	private String publishing;
	private int year;
	private int pages;
	private double price;
	private String binding;
	
	
	public Book(String name, String autors, String publishing, int year, int pages, double price, String binding) {
		this.id = ++idCounter;
		this.name = name;
		this.autors = autors;
		this.publishing = publishing;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
	}
	
	
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + autors + ", " + publishing + ", "
				+ year + ", " + pages + " pages, price: $" + price + ", " + binding;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutors() {
		return autors;
	}
	public void setAutors(String autors) {
		this.autors = autors;
	}
	public String getPublishing() {
		return publishing;
	}
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String isBinding() {
		return binding;
	}
	public void setBinding(String binding) {
		this.binding = binding;
	}
	
	public static void booksFromAutor(Book[] books, String autor) {
		for (Book x : books) {
			if (x.getAutors().equals(autor)) {
				System.out.println(x);
			}
		}
	}
	
	public static void booksFromPublishing(Book[] books, String publishing) {
		for (Book x : books) {
			if (x.getPublishing().equals(publishing)) {
				System.out.println(x);
			}
		}
	}
	
	public static void booksAfterYear(Book[] books, int year) {
		for (Book x : books) {
			if (x.getYear() >= year) {
				System.out.println(x);
			}
		}
	}
	

}
