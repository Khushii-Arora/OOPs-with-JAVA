package Lab4;

public class Lab4Q1 {
	
	    public static void main(String args[])
	    {
	    	double a[];
	    	a=new double[2];
	    	double c=1;
	    	for(int i=0;i<2;i++)
	    	{
				a[i] = Double.parseDouble(args[i]);
				c*=a[i];
	    	}
	
	    System.out.println(c);
	    }                                                                                                                                                                            

}

