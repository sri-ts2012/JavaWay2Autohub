package Polymorphismex;

public class Demostaticoverload {

	public static void main(String... args) {//var args
		
		Demostaticoverloadchildclass obj=new Demostaticoverloadchildclass();
		obj.a=12;
		obj.b=13;
		obj.m();
		
		//Demostaticoverloadchildclass.m();
		
		//o/p: subclass static method it looks like overridden but heere according to access method is first found in the childclass and hence the output
		//if we create another ref variable like below
		Demostaticoverloadsuperclass obj1=new Demostaticoverloadchildclass();
		obj1.m();
		//Demostaticoverloadsuperclass.display();//static or instance wont matter
		//obj1.display1();//cant access childclass methods with superclass ref var
		
		
	}

}
