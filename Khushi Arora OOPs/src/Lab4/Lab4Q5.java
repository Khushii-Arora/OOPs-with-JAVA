package Lab4;


public class Lab4Q5 {
	

		private String name;
		private int age;
		private int salary;
		
		Lab4Q5(String name,int age, int salary)
		{
			this.name=name;
			this.age=age;
			this.salary=salary;
		}
		
		public String setName() {
			return name;
			}
		public int setAge() {
			return age;
			}
		public int setSalary() {
			return salary;
			}
		
	
	
		public static void main(String args[])
	{
		Lab4Q5 person = new Lab4Q5("Khushi",2,3);
		
		System.out.println("person name= "+ person.setName() +"\n Age= "+person.setAge()+"\n Salary= "+person.setSalary());
		
	}
	
	
	
	
}
