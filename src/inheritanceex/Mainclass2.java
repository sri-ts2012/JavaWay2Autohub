package inheritanceex;

public class Mainclass2 {

	public static void main(String[] args) {
		superclass2 obj= new superclass2();
		subclass2 obj2=new subclass2();
		
		//obj.commonMethod();//o/p: common method from subclass as overridden although superclass ref 
		//obj.subClassMethod();//not valid as super class ref cannot access subclass only methods
		obj.superClassMethod();//o/p:superclassmethod
		obj2.subClassMethod();
		obj2.superClassMethod();//subclass can access superclass methods but superclass cannot access subclass only methods
		obj2.commonMethod();

		
		
		
		/*obj.m2();
		obj.m1();
		obj.m();*/

	}

}
