package inheritanceex;

public class BullDog extends Dog {
	
	
	/*public BullDog()
	{
		System.out.println("BullDog Constructor");
	}*/

	public BullDog()
	{
		
		super(123);//if not invoked then default is invoked without parameter
		System.out.println("BullDog Constructor");
	
}
}
