package LAB7;

class Student extends Person{
String program;
int year;
double fee;
Student(String name , String add,String pg, int yr,double f){
super(name,add);
this.program = pg;
this.fee = f;
this.year = yr;
}
String getProgram(){
return this.program;
}
double getFee(){
return this.fee;
}
int getYear(){
return this.year;
}
void setProgram(String pgr){
this.program = pgr;
}
void setYear(int y){
this.year = y;
}
void setFee(double f1){
this.fee = f1;
}
void tostring(){
System.out.println("Name: "+super.getName()+" address :"+super.getAddress()+" program: "+this.program+" year: "+this.year+" fee:"+this.fee);
}
}
