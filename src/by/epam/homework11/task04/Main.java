package by.epam.homework11.task04;

public class Main {

	public static void main(String[] args) {
		Train one = new Train("Gomel", 458, 19, 4);
		Train two = new Train("Kiyv", 777, 12, 47);
		Train three = new Train("Kiyv", 102, 9, 23);
		Train four = new Train("Gomel", 345, 21, 15);
		Train five = new Train("Berlin", 247, 8, 32);
		Train six = new Train("Paris", 584, 6, 43);
		
		Train[] trains = {two, one, three, four, five, six};
		
		for(Train x : trains) {
			System.out.print(x + "  |  ");
		}
		
		Train.sortNumbersOfTrains(trains);
		System.out.println();
		
		for(Train x : trains) {
			System.out.print(x + "  |  ");
		}
		Train.sortFinalDestinationOfTrains(trains);
		System.out.println();
		for(Train x : trains) {
			System.out.print(x + "  |  ");
		}

	}

}
