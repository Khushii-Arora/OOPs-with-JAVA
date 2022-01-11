package Lab6;

public class Lab6Q3 {
public double width;
public double height;
public double depth;

public Lab6Q3(double width, double height, double depth) {
this.width=width;
this.height=height;
this.depth=depth;
}

public double volume() {
return width*height*depth;
}

public static void main(String args[]) {
	Lab6Q3 box1= new Lab6Q3(10,20,30);
	Lab6Q3 box2= new Lab6Q3(5,8,9);
System.out.println("Volume of box1= "+ box1.volume());
System.out.println("Volume of box2= "+ box2.volume());
}
}