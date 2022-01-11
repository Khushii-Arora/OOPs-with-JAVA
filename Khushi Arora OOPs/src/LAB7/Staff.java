package LAB7;

class Staff extends Person{
String school;
double pay;
Staff(String name, String add, String school ,double p){
super(name,add);
this.school=school;
this.pay = p;
}
String getSchool(){
return this.school;
}
double getPay(){
return this.pay;
}
void setSchool(String sc){
this.school = sc;
}
void setPay(double py){
this.pay = py;
}
}
