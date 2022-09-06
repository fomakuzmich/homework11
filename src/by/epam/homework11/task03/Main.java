package by.epam.homework11.task03;

public class Main {

	public static void main(String[] args) {
		
		Student fomkin = new Student("Fomkin VS", 1, new int[] {9, 8, 7, 6, 5});
		Student pushkin = new Student("Pushkin AS", 1, new int[] {9, 10, 9, 10, 9});
		Student newton = new Student("Newton I", 2, new int[] {10, 10, 9, 10, 9});
		Student einstein = new Student("Einstein A", 2, new int[] {9, 4, 9, 10, 9});
		Student muhammad = new Student("Muhammad A", 3, new int[] {9, 10, 2, 10, 9});
		Student jordan = new Student("Jordan MB", 3, new int[] {9, 10, 9, 10, 9});
		Student cobain = new Student("Cobain KD", 4, new int[] {9, 10, 9, 10, 9});
		Student benington = new Student("Benington C", 4, new int[] {10, 10, 9, 10, 9});
		Student oruel = new Student("Oruel J", 5, new int[] {10, 10, 10, 10, 10});
		Student musk = new Student("Musk E", 5, new int[] {9, 10, 9, 10, 9});
		
		Student[] listStudents = new Student[] {fomkin, pushkin, newton, einstein, 
				muhammad, jordan, cobain, benington, oruel, musk};
		Student.printNerds(listStudents);
		
	}

}
