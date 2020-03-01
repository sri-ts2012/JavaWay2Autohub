package Polymorphismex;

public class Demostaticoverloadchildclass extends Demostaticoverloadsuperclass {
	
	/*static void m()
	{
		System.out.println("subclass static method");
	}
	*/
	
	static int b;
	static void m(){
		System.out.println("subclass static method");
		System.out.println("the value ofb="+b);//

}
	static void display2()
	{
		System.out.println("display from subclass");
	}
}
