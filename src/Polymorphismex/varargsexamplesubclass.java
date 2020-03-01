package Polymorphismex;

public class varargsexamplesubclass {
	
	void add(int...x)
	{
		int sum=0;
		System.out.println("\n The elements:");
		for(int k:x)
		{
			System.out.println(k+"");
			sum=sum+k;
		}
	System.out.println("-->"+sum);
	}
	

}
