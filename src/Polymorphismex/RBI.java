package Polymorphismex;

public class RBI {
	
	public double getHomeLoan()
	{
		return 19.4;
	}
	
	public double getCarLoan()
	{
		return 5.3;
	}
	
	 
	 //create method which actually returns the object of this class
	 //return types are class names and there is parent child relationship between RBI and HSBC
	public RBI getObject()
	 {
		RBI obj=new RBI();
		 System.out.println(obj);
		 return obj;
		
	 }
	
	

}
