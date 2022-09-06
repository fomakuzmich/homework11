package by.epam.homework11.task07;

public class Triangle {
	
	private int ax;
	private int ay;
	private int bx;
	private int by;
	private int cx;
	private int cy;
	
	private double ab;
	private double bc;
	private double ca;
	
	public Triangle(int ax, int ay, int bx, int by, int cx, int cy) {
		this.ax = ax;
		this.ay = ay;
		this.bx = bx;
		this.by = by;
		this.cx = cx;
		this.cy = cy;
		this.ab = l(ax, ay, bx, by);
		this.bc = l(bx, by, cx, cy);
		this.ca = l(cx, cy, ax, ay);
		
		
	}
	public double getAb() {
		return ab;
	}
	public double getBc() {
		return bc;
	}
	public double getCa() {
		return ca;
	}
	public int getAx() {
		return ax;
	}
	public void setAx(int ax) {
		this.ax = ax;
	}
	public int getAy() {
		return ay;
	}
	public void setAy(int ay) {
		this.ay = ay;
	}
	public int getBx() {
		return bx;
	}
	public void setBx(int bx) {
		this.bx = bx;
	}
	public int getBy() {
		return by;
	}
	public void setBy(int by) {
		this.by = by;
	}
	public int getCx() {
		return cx;
	}
	public void setCx(int cx) {
		this.cx = cx;
	}
	public int getCy() {
		return cy;
	}
	public void setCy(int cy) {
		this.cy = cy;
	}

	public static double l(int x1, int y1, int x2, int y2) {
		int x = x2 - x1;
		int y = y2 - y1;
		double l = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		return l;
	}
	public void medianPoint() {
		double x = (this.ax + this.bx + this.cx) / 3;
		double y = (this.ay + this.by + this.cy) / 3;
		
		System.out.println("x - " + x + "; y - " + y);
	}
	public double perimeterOfTriangle() {
		
		double perimeter = this.ab + this.bc + this.ca;
		
		return perimeter;
	}
	
	public double areaOfTriangle() {
		
		double sp = this.perimeterOfTriangle() / 2;
		
		double area = Math.sqrt(sp * (sp - ab) * (sp - bc) * (sp - ca));
		
		return area;
	}
	
}
