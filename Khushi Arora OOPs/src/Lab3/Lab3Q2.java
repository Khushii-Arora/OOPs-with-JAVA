
package Lab3;
public class Lab3Q2 {
public static void main(String[] args) {
int arr[] = {1,2,3,4,5,6};
// assign first array element to two variables
int max = arr[0];
int min = arr[0];
// iterate and compare from array index 1
for(int i = 1; i < arr.length; i++){
if(max < arr[i]){
max = arr[i];
}else if(min > arr[i]){
min = arr[i];
}
}
System.out.println("Maximum number = "
+ max + " Minimum number = " + min);
}}