package inheritanceex;

public class Construexsublass extends Construexsuperclass{
	Construexsublass()
	{
		System.out.println("from subclass constructor");
	}
	
	Construexsublass(int x)
	{
		
	super(12);
		//super(12);// this must be first --constructor call followed by sop 
		//for parameterised constructor super has to be used ,for non parameterised constructor no need of super(x) as it automatically invokes default constructor of superclass
		//if super not used then its output is different its not throwing error??but calling the superclass zero arg constructor
		System.out.println("from subclass constructor");
		
	}
	

}
