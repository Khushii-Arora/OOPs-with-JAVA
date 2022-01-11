package Lab5;

public class Point {
	private int x;
	private int y;
	
		public Point (int x, int y) {
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
			Point p= new Point(0,0);
	System.out.println("triangle coordinates= ("+ p.getX()+ "," + p.getY()+") ");
	p.move(2,2);
	System.out.println("After using move() Triangle is now at= ("+ p.getX()+ "," + p.getY()+") ");
	}
}


