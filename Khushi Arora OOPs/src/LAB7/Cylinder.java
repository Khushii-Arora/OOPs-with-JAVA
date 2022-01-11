package LAB7;

public class Cylinder extends circle {
	
	private double height;
	
	public Cylinder() {
		height=1.0;
	}
	
	public Cylinder(double radius) {
		super(radius);
		
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height=height;
	}
	
	public Cylinder(double radius, double height, String color) {
		super(radius,color);
		this.height=height;
		
	}
	
	public double getHeight() {
		return height;
		
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	
	public double getVolume() {
		return getArea()*height;
	}
	

}


