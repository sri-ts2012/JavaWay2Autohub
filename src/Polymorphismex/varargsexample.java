package Polymorphismex;

public class varargsexample {

	public static void main(String[] args) {
		varargsexamplesubclass obj= new varargsexamplesubclass();
		obj.add(1,2);
		obj.add(1,2,3);
		obj.add(1,2,3,4);
		obj.add(1,2,3,5);
		obj.add(1,2,3,6);
		obj.add(1,2,3,7);
		
		
		/*Limitation of var args is : can collect similar data type parameters

		For different type parameters, valid syntax is

		Void add(string name, float k, int...x)
		Invalid is 
		Void add(int...x,string name, float k)--shd not be at start..onlt at the end
		Void add (int...x,float...Y0--two not possible*/


	}

}
