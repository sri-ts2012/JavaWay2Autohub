package Polymorphismex;

public class constructoroverloadsubclass {
	
	constructoroverloadsubclass()
	{
		System.out.println("from zero parameter constructor ");
	}
	
	//method overloading
	constructoroverloadsubclass(int x)
	{
		this();//this will invoke the zero parameter constructor() of current running class
		//constructor chaining can use new constructoroverloadsubclass();
		//this(12);//there should be another parameterised construcot to use this
		System.out.println("from parametrised constructor");
	}

}
