package inheritanceex;

public class Dog extends Animal {
	
	public Dog()
	{
		System.out.println("Dog Constructor");
	}
	
	public Dog(int x)
	{
		System.out.println("Dog constructor with parameter");
	}
	public void sound()
	{
		super.sound();//to call the superclass version of the overriden method-want to call overiiden method and original method of superclass
		System.out.println("Dog sound");
		
	}

}
