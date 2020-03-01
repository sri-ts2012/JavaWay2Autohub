package Polymorphismex;

public class HSBC extends RBI {
	
	//either create main method here or implement a separate main class like in overloading examples
	public static void main(String[] args)
	{
		HSBC obj=new HSBC();
		 System.out.println(obj);
		System.out.println(obj.getHomeLoan());
	}
	
		 public double getHomeLoan()//own implementation of the HSBC- as reqmnt is diff
		{
			return 3;
		}
		 
		
		 
		 //create method which actually returns the object of this class
		 //return types are class names and there is parent child relationship between RBI and HSBC
		 
		/* public HSBC getObject()
		 {
			 HSBC obj=new HSBC();
			 System.out.println(obj);
			 return obj;
			
		 }*/
		 
		 
		 public CITI getObject()//getobject() method cannot be duplicate only based on return type
		 {
			CITI obj=new CITI();
			 System.out.println(obj);
			 return obj;
			
		 }
		 
		 public Integer show()//dont have to extend number class as the int is automatic to Number class
			{
				return 10;
			}
		 
		 /*public Number show()
		 {
			 return 10;
		 }*/
		 
		 }
		 //another ex:
	


