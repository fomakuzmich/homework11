package by.epam.homework11.task05;

public class Counter {
	
	private int min;
	private int max;
	private int count;
	
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Counter(int min, int max, int count) {
		this.min = min;
		this.max = max;
		this.count = count;
	}
	public Counter(int max, int count) {
		this.min = 0;
		this.max = max;
		this.count = count;
	}
	public Counter(int max) {
		this.min = 0;
		this.max = max;
		this.count = 0;
	}
	public Counter() {
		this.min = 0;
		this.max = 10;
		this.count = 0;
	}
	
	public void plusCount(int x) {
		
		for (int i = 0; i < x; i++) {
			this.plusCount();
		}
	}
	
	public void plusCount() {
		this.count++;
		if (this.count > this.max) {
			this.count = this.min;
		}
	}
	
	public void minusCount(int x) {
		for (int i = 0; i < x; i++) {
			this.minusCount();
		}
	}
	
	public void minusCount() {
		this.count--;
		if (this.count < this.min) {
			this.count = this.max;
		}
	}
	
	
	public void getInfo() {
		System.out.print(getCount() + " ");
	}
	
	

}
