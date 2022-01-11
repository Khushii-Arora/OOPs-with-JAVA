package Lab3;
public class Lab3Q3 {
public static void main(String[] args)
{
String[] strarray = {"Blue", "Black", "Brown", "Brown", "Blue", "Red", "Green"};
for (int i = 0; i < strarray.length-1; i++)
{
for (int j = i+1; j < strarray.length; j++)
{
if( (strarray[i].equals(strarray[j])) && (i != j) )
{
System.out.println("Duplicate Element is : "+strarray[j]);
}
}
}
}
}