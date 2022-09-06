package by.epam.homework11.task10;

import by.epam.homework11.task06.MyTime;

public class Main {

	public static void main(String[] args) {
		
		Airline one = new Airline("London", 1524, "Cargo", new MyTime(15, 35, 0), new String[] {"Monday", "Wednesday", "Friday"});
		Airline two = new Airline("London", 1627, "Passenger", new MyTime(18, 7, 0), new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"});
		Airline three = new Airline("London", 1324, "Passenger", new MyTime(3, 10, 0), new String[] {"Saturday", "Sunday"});
		Airline four = new Airline("Chelsea", 1874, "Passenger", new MyTime(15, 0, 0), new String[] {"Monday", "Wednesday", "Friday"});
		Airline five = new Airline("Chelsea", 2521, "Passenger", new MyTime(15, 50, 0), new String[] {"Tuesday", "Thursday", "Saturday"});
		Airline six = new Airline("Kyiv", 8755, "Cargo", new MyTime(19, 25, 0), new String[] {"Monday", "Thursday"});
		Airline seven = new Airline("Kyiv", 3524, "Cargo", new MyTime(9, 40, 0), new String[] {"Tuesday", "Saturday"});
		
		Airline[] airlines = new Airline[] {one, two, three, four, five, six, seven};
		
		Airline.printAirlinesForDestination(airlines, "London");
		System.out.println();
		Airline.printAirlinesForDay(airlines, "Tuesday");
		System.out.println();
		Airline.printAirlinesForDayAfterTime(airlines, "Monday", new MyTime(15, 30, 0));
				
	}

}
