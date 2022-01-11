package LAB7;

public class TestCylinder {
	
	public static void main(String args[]) {
		Cylinder c1=new Cylinder();
		Cylinder c2=new Cylinder(10.0);
		Cylinder c3=new Cylinder(2.0,10.0);
		
		System.out.println("Cylinder object 1: \nradius="+ c1.getRadius()+"\nheight="+c1.getHeight()+" \nbase area="+c1.getArea()+"\nVolume="+c1.getVolume());
		System.out.println("\nCylinder object 2: \nradius="+ c2.getRadius()+"\nheight="+c2.getHeight()+" \nbase area="+c2.getArea()+"\nVolume="+c2.getVolume());
		System.out.println("\nCylinder object 3: \nradius="+ c3.getRadius()+"\nheight="+c3.getHeight()+" \nbase area="+c3.getArea()+"\nVolume="+c3.getVolume());
	}

}