package Polymorphismex;

public class Demostaticoverloadsuperclass {
	
	/*static void m()
	{
		System.out.println("superclass static method");
	}
	*/
	
static int a;
static void m(){
	System.out.println("superclass static method");
	System.out.println("the value of a="+a);//sop statements shd be written under a method like main or any method...not directly under class
	
}
void display()
{
	System.out.println("display from superclass");
}



}
