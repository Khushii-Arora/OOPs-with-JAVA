
package Lab2;

public class Lab2Q1 {
	private int x;
	private int y;
	
		public Lab2Q1 (int x, int y) {
		this.x=x;
		this.y=y;
		}
	
		public int getX() {
		return x;
		}
		
		public int getY() {
		return y;
		}
		
		public void move(int x, int y) {
		this.x=x;
		this.y=y;
		}
		
		public static void main(String args[])
		{
			Lab2Q1 p= new Lab2Q1(2,3);
	System.out.println("p= "+ p.getX()+ "," + p.getY());
	p.move(5,6);
	System.out.println("After using move() p is now at= "+ p.getX()+ "," + p.getY());
	}
}


