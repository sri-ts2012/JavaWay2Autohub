package Polymorphismex;

public class Emp extends Person {
	float salary;
	Emp(int id,String name,float salary){  
		//this(1,"ddd");//if this has to be used then another constructor of the same format as below
		super(id,name);//reusing parent constructor  
		this.salary=salary;  
		}  

	
	/*public Emp(int i, String string) {
		// TODO Auto-generated constructor stub
	}*/


	void display()
	{
		System.out.println(id+"  "+name+"  "+salary);
	}
}
