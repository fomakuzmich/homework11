package by.epam.homework11.task08;

public class Main {

	public static void main(String[] args) {
		
		Customer one = new Customer("Pit", "Bred", "Viktorovich", "London, Kolhoznaya, 17", 6454121232325656l, 1245847528l);
		Customer two = new Customer("Depp", "Jonny", "Borisovich", "Miami, Lesnaya, 23", 6585465895566854l, 4567895459l);
		Customer three = new Customer("Jasta", "Jimmy", "Vasil'evich", "Paris, Rechnaya, 10", 8984659456595265l, 7894561256l);
		Customer four = new Customer("Bennington", "Chester", "Anatol'evich", "Prague, Selskaya, 3", 4455686526598656l, 7485962554l);
		Customer five = new Customer("Ramon", "Tony", "Petrovich", "Kiyv, Solnechnaya, 1", 7878455656565646l, 4547546856l);
		Customer six = new Customer("Christos", "Jesus", "Leonidovich", "New York, Dranaya, 7", 7874565656565448l, 3578595664l);
		
		Customer[] customers = new Customer[] {one, two, three, four, five, six};
		
		Customer.getCustomersABC(customers);
		Customer.getCustomersFromCard(customers, 6000000000000000l, 8000000000000000l);
	}

}
