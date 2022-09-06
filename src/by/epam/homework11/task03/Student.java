package by.epam.homework11.task03;

public class Student {
	
	private String name;
	private int groupNumber;
	private int[] performance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGroupNumber() {
		return groupNumber;
	}
	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}
	public int[] getPerformance() {
		return performance;
	}
	public void setPerformance(int[] performance) {
		this.performance = performance;
	}
	
	public Student(String name, int groupNumber, int[] performance) {
		super();
		this.name = name;
		this.groupNumber = groupNumber;
		this.performance = performance;
	}
	
	public static void printNerds (Student[] students) {
		for (Student man : students) {
			boolean goodBoy = true;
			for (int x : man.getPerformance()) {
				if (x < 9) {
					goodBoy = false;
				}
			}
			if (goodBoy == true) {
				System.out.println(man.toString());
			}
		}
	}
	@Override
	public String toString() {
		return name + " - " + groupNumber;
	}
	
	
	

}
