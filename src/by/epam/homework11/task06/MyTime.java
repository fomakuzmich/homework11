package by.epam.homework11.task06;

public class MyTime {
	
	private int hours;
	private int minutes;
	private int seconds;
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		if (hours > 24 || hours < 0) {
			this.hours = 0;
		}
		else {
			this.hours = hours;
		}
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		if (minutes > 59 || minutes < 0) {
			this.minutes = 0;
		}
		else {
			this.minutes = minutes;
		}
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		if (seconds > 59 || seconds < 0) {
			this.seconds = 0;
		}
		else {
			this.seconds = seconds;
		}
	}
	
	public MyTime(int hours, int minutes, int seconds) {
		if (hours < 0 || hours > 23) {
			this.hours = 0;
		}
		else {
			this.hours = hours;
		}
		if (minutes < 0 || minutes > 59) {
			this.minutes = 0;
		}
		else {
			this.minutes = minutes;
		}
		if (seconds < 0 || seconds > 59) {
			this.seconds = 0;
		}
		else {
			this.seconds = seconds;
		}
	}
	
	public MyTime() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}
	
	public void plusHours(int hours) {
		this.hours = (this.hours + hours) % 24;
	}
	
	public void minusHours(int hours) {
		for (int i = 0; i < hours; i++) {
			this.hours--;
			if (this.hours < 0) {
				this.hours = 23;
			}
		}
	}
	
	public void plusMinutes(int minutes) {
		if ((this.minutes + minutes) > 59) {
			this.plusHours((this.minutes + minutes) / 60);
		}
		this.minutes = (this.minutes + minutes) % 60;
	}
	
	public void minusMinutes(int minutes) {
		for (int i = 0; i < minutes; i++) {
			this.minutes--;
			if (this.minutes < 0) {
				this.minutes = 59;
				this.minusHours(1);
			}
		}
	}
	
	public void minusSeconds(int seconds) {
		for (int i = 0; i < seconds; i++) {
			this.seconds--;
			if(this.seconds < 0) {
				this.seconds = 59;
				this.minusMinutes(1);
			}
		}
	}
	
	public void plusSeconds(int seconds) {
		if ((this.seconds + seconds) > 59) {
			this.plusMinutes((this.seconds + seconds) / 60);
		}
		this.seconds = (this.seconds + seconds) % 60;
	}
	
	public void plusMyTime(int hours, int minutes, int seconds) {
		this.plusHours(hours);
		this.plusMinutes(minutes);
		this.plusSeconds(seconds);
	}
	
	public void plusMyTime(MyTime x) {
		this.plusHours(x.getHours());
		this.plusMinutes(x.getMinutes());
		this.plusSeconds(x.getSeconds());
	}
	
	public void minusMyTime(int hours, int minutes, int seconds) {
		this.minusHours(hours);
		this.minusMinutes(minutes);
		this.minusSeconds(seconds);
	}
	
	public void minusMyTime(MyTime x) {
		this.minusHours(x.getHours());
		this.minusMinutes(x.getMinutes());
		this.minusSeconds(x.getSeconds());
	}
	
	public void showMyTime() {
		if (this.hours < 10) {
			System.out.print("0");
		}
		System.out.print(this.hours + ":");
		if (this.minutes < 10) {
			System.out.print("0");
		}
		System.out.print(this.minutes + ":");
		if (this.seconds < 10) {
			System.out.print("0");
		}
		System.out.println(this.seconds);
	}
	@Override
	public String toString() {
		String h = "";
		String m = "";
		String s = "";
		if (this.hours < 10) {
			h += "0";
		}
		h += this.hours;
		if (this.minutes < 10) {
			m += "0";
		}
		m += this.minutes;
		if (this.seconds < 10) {
			s += "0";
		}
		s += this.seconds;
		return h + ":" + m + ":" + s;
	}
	
	
	

}
