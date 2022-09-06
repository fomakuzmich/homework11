package by.epam.homework11.task06;

public class Main {

	public static void main(String[] args) {
		
		MyTime one = new MyTime(2, 5, 4);
		one.showMyTime();
		one.plusHours(5);
		one.plusMinutes(57);
		one.plusSeconds(61);
		one.showMyTime();
		MyTime two = new MyTime();
		two.showMyTime();
		two.plusMyTime(10, 10, 10);
		one.showMyTime();
		two.showMyTime();
		one.plusMyTime(two);
		one.showMyTime();
		one.minusMyTime(two);
		one.showMyTime();
		one.minusMyTime(12, 10, 10);
		one.showMyTime();
		
		
	}

}
