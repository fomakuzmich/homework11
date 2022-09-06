package by.epam.homework11.task07;

public class Main {

	public static void main(String[] args) {
		
		Triangle one = new Triangle(1, 1, 2, 2, 2, 1);
		System.out.println(one.perimeterOfTriangle());
		System.out.println(one.areaOfTriangle());
		one.medianPoint();
		
		System.out.println(one.getAb());
		System.out.println(one.getBc());
		System.out.println(one.getCa());
		
		
	}

}
