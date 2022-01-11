package Lab6;
 
import java.util.*;
 
public class Lab6Q1 {
 
	private int num;
 
	public Lab6Q1()
	{int num=0;}
 
	public Lab6Q1(int x)
	{
		num=x;
	}
 
		public void isNegative(int x)
		{
			if(x<0) {System.out.println("Number entered is negative");}
			else {System.out.println("Number entered is not negative");}
		}
 
		public void isPositive(int x)
		{
			if(x>0) {System.out.println("Number entered is Positive");}
			else {System.out.println("Number entered is not Positive");}
		}
 
		public void isZero(int x)
		{
			if(x==0) {System.out.println("Number entered is Zero");}
			else {System.out.println("Number entered is not Zero");}
		}
 
		public void isOdd(int x)
		{
			if(x%2!=0) {System.out.println("Number entered is Odd");}
			else {System.out.println("Number entered is not Odd");}
 
		}
 
		public void isEven(int x)
		{
			if(x%2==0) {System.out.println("Number entered is Even");}
			else {System.out.println("Number entered is not Even");}
 
		}
 
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number to check if its\n 1. Negative\n 2. Positive\n 3. Zero\n 4. Odd\n 5. Even\n ");
 
 
		int num= s.nextInt();
		Lab6Q1 obj=new Lab6Q1(num);
 
		obj.isNegative(num);
		obj.isPositive(num);
		obj.isZero(num);
		obj.isEven(num);
		obj.isOdd(num);
 
	s.close();	
	}
 
 
}
 