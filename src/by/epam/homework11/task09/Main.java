package by.epam.homework11.task09;

public class Main {

	public static void main(String[] args) {
		
		Book one = new Book("1984", "Oruel", "Secker and Warburg", 1949, 321, 20, false);
		Book two = new Book("We", "Zamyatin", "Chehova", 1924, 415, 15, true);
		Book three = new Book("Brave new world", "Huxley", "Chatto & Windus", 1932, 182, 12, false);
		Book four = new Book("Fahrenheit 451", "Bradbury", "Ballantine books", 1953, 254, 16, false);
		Book five = new Book("More than noize", "O'Hara", "AK Press", 1999, 321, 17, false);
		Book six = new Book("The prison house", "King", "Vintage", 2004, 247, 19, false);
		Book seven = new Book("Trainspotting", "Welsh", "Harvill Secker", 1993, 401, 21, true);
		Book eight = new Book("Animal farm", "Oruel", "Harvill Secker", 1945, 177, 14, false);
		Book nine = new Book("Dandelion wine", "Bradbury", "Doubleday", 1957, 246, 18, true);
		Book ten = new Book("Headhunters", "King", "Jonathan Cape", 1997, 287, 16, false);
		Book eleven = new Book("Fight club", "Palahniuk", "Norton & Co", 1996, 256, 24, false);
		Book twelve = new Book("Survivor", "Palahniuk", "Norton & Co", 1999, 320, 17, false);
		Book thirteen = new Book("The acid house", "Welsh", "Harvill Secker", 1994, 316, 17, false);
		Book fourteen = new Book("Glue", "Welsh", "Harvill Secker", 2001, 720, 27, true);
		
		BookStore libruary = new BookStore(one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen);
		
		OutputBook.printBooks(libruary.getBooksAfterYear(2000));
		OutputBook.printBooks(libruary.getBooksFromAutor("Bradbury"));
		OutputBook.printBooks(libruary.getBooksFromPublishing("Harvill Secker"));
		
		
	}
	
}
