package LAB7;

class Person{
String name;
String address;
Person(String n , String a){
this.address = a;
this.name = n;
}
String getName(){
return this.name;
}
String getAddress(){
return this.address;
}
void setAddress(String add){
this.address = add;
}
void setName(String name1){
this.name = name1;
}
void tostring(){
System.out.println("Name: "+this.name+" address : "+this.address);
}
}
