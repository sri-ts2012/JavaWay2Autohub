package Polymorphismex;

public class varargconstructorexamplesubclass {
	
/*	varargconstructorexamplesubclass(int...x)
	{
		for(int k:x){
			System.out.println("the value="+k);
		}
	}
	//above only to display the numbers
*/	//below to sum
	varargconstructorexamplesubclass(int...x)
	{
		int sum=0;
		for(int k:x){
			System.out.println("the value="+k);
			sum=sum+k;
		}
		System.out.println("--->"+sum);
	}


}
