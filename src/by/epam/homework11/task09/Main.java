package by.epam.homework11.task09;

public class Main {

	public static void main(String[] args) {
		
		Book one = new Book("1984", "Oruel", "Secker and Warburg", 1949, 321, 20, "soft cover");
		Book two = new Book("We", "Zamyatin", "Chehova", 1924, 415, 15, "hard cover");
		Book three = new Book("Brave new world", "Huxley", "Chatto & Windus", 1932, 182, 12, "soft cover");
		Book four = new Book("Fahrenheit 451", "Bradbury", "Ballantine books", 1953, 254, 16, "soft cover");
		Book five = new Book("More than noize", "O'Hara", "AK Press", 1999, 321, 17, "soft cover");
		Book six = new Book("The prison house", "King", "Vintage", 2004, 247, 19, "soft cover");
		Book seven = new Book("Trainspotting", "Welsh", "Harvill Secker", 1993, 401, 21, "hard cover");
		
		Book[] books = new Book[] {one, two, three, four, five, six, seven};
		for (Book x : books) {
			System.out.println(x);
		}
		Book.booksFromAutor(books, "King");
		Book.booksFromPublishing(books, "Vintage");
		Book.booksAfterYear(books, 2000);
	}

}
