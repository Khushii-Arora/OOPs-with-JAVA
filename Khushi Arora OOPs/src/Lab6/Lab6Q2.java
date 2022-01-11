package Lab6;

public class Lab6Q2{
public int rollno;
public String name;
public double percentage;
static int counter;

public Lab6Q2() {
rollno=0;
name=null;
percentage=0.00;
counter++;
}

public Lab6Q2(int rollno, String name, double percentage) {
this.rollno= rollno;
this.name=name;
this.percentage=percentage;
counter++;
}

public String toString() {
return "rollno= "+rollno+" name= "+name+ " percentage= "+percentage;
}

public static void main(String args[]) {
	Lab6Q2 std1= new Lab6Q2(1, "Khushi", 93);
System.out.println("Counter has been initialized to= "+ counter);
System.out.println(std1.toString());
Lab6Q2 std2=new Lab6Q2(2, "XYZ", 73);
System.out.println(std2.toString());
System.out.println("Counter has been initialized to= "+counter);
}



}