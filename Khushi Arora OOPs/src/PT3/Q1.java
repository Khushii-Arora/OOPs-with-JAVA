package PT3;
import java.lang.*;
import java.util.Scanner;

public class Q1 {
	
	int num,depo,withd;
	
	Q1(int balance, int x, int y)
	{
		num=balance;
		depo=x;
		withd=y;
	}
	
	
	public void validException1(int num, int depo, int withd)
	{
		if(depo<1 && withd<1){throw new ArithmeticException("InValidAmountException, please enter a number greater than 0");}
		else if(withd>num) {throw new ArithmeticException("InSufficientFunds, dont have enough money in account");}
		else {
			System.out.println("Valid Amount, processing further...");
			int finaldepo=num+depo;
			int finalwithd=finaldepo-withd;
			System.out.println("Balance after deposite: "+finaldepo+" and After withdraw: "+finalwithd);
			
		}
	}
	
	

	
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter Account Balance");
		int num= s.nextInt();
		
		System.out.println("Enter a number amount to be Deposite\n");
		int depo = s.nextInt();
		
		System.out.println("Enter a number amount to be withdrawed\n");
		int withd = s.nextInt();
		Q1 obj=new Q1(num,depo,withd);
		
				try {
					obj.validException1(num,depo,withd);
				}
				catch(Exception e) {System.out.println(e);};
				
		
		
		
		
		
		s.close();
	}

}
