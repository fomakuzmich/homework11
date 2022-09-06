package by.epam.homework11.task10;

import java.util.Arrays;

import by.epam.homework11.task06.MyTime;

public class Airline {
	
	private String finalDestination;
	private int flightNumber;
	private String typeOfAirplane;
	private MyTime time;
	private String[] days;
	
	public Airline(String finalDestination, int flightNumber, String typeOfAirplane, MyTime time, String[] days) {
		
		this.finalDestination = finalDestination;
		this.flightNumber = flightNumber;
		this.typeOfAirplane = typeOfAirplane;
		this.time = time;
		this.days = days;
	}

	public String getFinalDestination() {
		return finalDestination;
	}

	public void setFinalDestination(String finalDestination) {
		this.finalDestination = finalDestination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getTypeOfAirplane() {
		return typeOfAirplane;
	}

	public void setTypeOfAirplane(String typeOfAirplane) {
		this.typeOfAirplane = typeOfAirplane;
	}

	public MyTime getTime() {
		return time;
	}

	public void setTime(MyTime time) {
		this.time = time;
	}

	public String[] getDays() {
		return days;
	}

	public void setDays(String[] days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return flightNumber + ", Destination: " + finalDestination + ", "
				+ typeOfAirplane + ", " + time + Arrays.toString(days);
	}
	
	public static void printAirlinesForDestination(Airline[] airlines, String destination) {
		for (Airline x : airlines) {
			if (x.finalDestination.equals(destination)) {
				System.out.println(x);
			}
		}
	}
	
	public static void printAirlinesForDay(Airline[] airlines, String day) {
		for (Airline x : airlines) {
			for (String d : x.days) {
				if (d.equals(day)) {
					System.out.println(x);
				}
			}
		}
	}
	
	public static void printAirlinesForDayAfterTime(Airline[] airlines, String day, MyTime time) {
		for (Airline x : airlines) {
			for (String d : x.days) {
				if (d.equals(day)) {
					if (x.getTime().getHours() != time.getHours()) {
						if (x.getTime().getHours() > time.getHours()) {
							System.out.println(x);
						}
					}
					else if (x.getTime().getMinutes() != time.getMinutes()) {
						if (x.getTime().getMinutes() > time.getMinutes()) {
							System.out.println(x);
						}
					}
					else if (x.getTime().getSeconds() >= time.getSeconds()) {
						System.out.println(x);
					}
				}
			}
		}
	}



}
