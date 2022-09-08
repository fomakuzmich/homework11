package by.epam.homework11.task09;

import java.util.List;

public class OutputBook {

	public static void printBooks(List<Book> books) {
		for (Book book : books) {
			if (book.getId() < 100000000) {
				System.out.println("id: 0" + book.getId() + ", \"" + book.getName() + "\", " + book.getAutors() + ", " + book.getPublishing() + ", " + 
								book.getYear() + ", " + book.getPages() + "pgs, " + book.getBinding().getBlinding() + ", $" + book.getPrice());
			}
			else {
				System.out.println("id: " + book.getId() + ", \"" + book.getName() + "\", " + book.getAutors() + ", " + book.getPublishing() + ", " + 
						book.getYear() + ", " + book.getPages() + "pgs, " + book.getBinding().getBlinding() + ", $" + book.getPrice());
	
			}
		}
		System.out.println();
	}


}
