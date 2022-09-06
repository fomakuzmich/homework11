package by.epam.homework11.task05;

public class Main {

	public static void main(String[] args) {
		
		Counter one = new Counter();
		one.getInfo();
		one.plusCount(2);
		one.getInfo();
		one.minusCount(1);
		one.getInfo();
		one.plusCount();
		one.getInfo();
		System.out.println();
		
		Counter two = new Counter(3);
		two.getInfo();
		two.plusCount();
		two.getInfo();
		two.plusCount();
		two.getInfo();
		two.plusCount();
		two.getInfo();
		two.plusCount();
		two.getInfo();
		System.out.println();
		
		Counter three = new Counter(5, 3);
		for (int i = 0; i < 15; i++) {
			three.minusCount();
			three.getInfo();
		}
		System.out.println();
		
		Counter four = new Counter(3, 6, 4);
		four.getInfo();
		for (int i = 0; i < 12; i++) {
			four.plusCount();
			four.getInfo();
		}
		
	}

}
