package Polymorphismex;

public class CITI extends RBI {
	
	//either create main method here or implement a separate main class like in overloading examples
	public static void main(String[] args)
	{
	CITI obj=new CITI();
		System.out.println(obj.getHomeLoan());
	}
	
		 public double getHomeLoan()//own implementation of the CITI
		{
			return 4;
		}
	}


