package by.epam.homework11.task04;

import java.util.Arrays;

import by.epam.homework11.task06.MyTime;

public class Train implements Comparable<Train>{
	
	String finalDestination;
	private int number;
	//double time;
	private MyTime time;
	
	@Override
	public String toString() {
		return number + " - " + finalDestination + " - " + time;
	}
	
	public String getFinalDestination() {
		return finalDestination;
	}
	public void setFinalDestination(String finalDestination) {
		this.finalDestination = finalDestination;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public MyTime getTime() {
		return time;
	}
	public void setTime(MyTime time) {
		this.time = time;
	}
	
	public Train(String finalDestination, int number, MyTime time) {
		
		this.finalDestination = finalDestination;
		this.number = number;
		this.time = time;
	}
	
	public Train(String finalDestination, int number, int hours, int minutes) {
		
		this.finalDestination = finalDestination;
		this.number = number;
		this.time = new MyTime(hours, minutes);
	}
	
	public void getInfo(int number, Train[] trains) {
		for (Train x : trains) {
			if (x.getNumber() == number) {
				System.out.println(x.toString());
			}
		}
	}
	
	public static Train[] sortNumbersOfTrains(Train[] trains) {
		
		for (int i = 1; i < trains.length; i++) {
			
			for (int j = 0; j < i; j++) {
				
				if (trains[i].number < trains[j].number) {
					Train x = trains[i];
					
					for (int n = i; n > j; n--) {
						trains[n] = trains[n - 1];
					}
					trains[j] = x;
				}
			}
		}
		
		return trains;
	}
	
	public static Train[] sortFinalDestinationOfTrains(Train[] trains) {
		
		Arrays.sort(trains);
		return trains;
	}
	
	@Override
	public int compareTo(Train t) {
		if (this.finalDestination.equals(t.getFinalDestination())) {
			if (this.getTime().getHours() != time.getHours()) {
				return this.getTime().getHours() - t.getTime().getHours();
			}
			else if (this.getTime().getMinutes() != t.getTime().getMinutes()) {
				return this.getTime().getMinutes() - t.getTime().getMinutes();
			}
			else {
				return this.getTime().getSeconds() - t.getTime().getSeconds();}
		}
		else {
			return this.finalDestination.compareTo(t.getFinalDestination());
		}
	}

}
