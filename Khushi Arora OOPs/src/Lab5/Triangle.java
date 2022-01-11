package Lab5;
import java.util.*;
import java.math.*;
public class Triangle {
	
		Point centre; //here we are re-using the class Point as a data member center
		private int l,h; //data members
		
		Triangle(Point centre, int l, int h){ 
			this.centre=centre;
			this.l=l;
			this.h=h;
	
			}

		public Point getCentre() {
		return centre;
		}
		
		public int getL() {
			return l;
			}
			
			public int getH() {
			return h;
			}
			
			
			double Area() { 
				return (0.5*l*h);
				}
			
			double distance(int x_1, int x_2,int y_2, int y_1) {
				
				return( Math.sqrt((x_2-x_1)^2+(y_2-y_1)^2));
			}
			
		
		public static void main(String[] args) {

			Point p=new Point(1,1); // a new object of point class
			
			Scanner s= new Scanner(System.in);
			System.out.println("Enter Length and Breadth ");
			int l= s.nextInt();
			int h= s.nextInt();
			Triangle t=new Triangle(p,l,h);
			
			System.out.println("Area= "+ t.Area());
			
			System.out.println("Enter Coordinates of Hypoteneus ");
			int x1= s.nextInt();
			int y1= s.nextInt();
			int x2= s.nextInt();
			int y2= s.nextInt();
			
			System.out.println("Distance= "+ t.distance(x1,x2,y2,y1));
			
			
			s.close();
			}

		

	

}
