package LAB7;

public class circle {
	
	private double radius; 
	private String color;
	
	public circle() {
		radius=1.0f;
		color="red";
	}
	
	public circle(double radius) {
		this.radius=radius;
	}
	
	public circle(double radius, String color) {
		this.radius=radius;
		this.color=color;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public double getArea(){
		return 3.14*radius*radius;
		
	}
	public String toString() {
		return "Circle[radius= "+radius+" color= " +color+ "]" ;
	}
}