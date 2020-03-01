package Polymorphismex;

public class Overloadingexamples {

	public static void main(String[] args) {
	//https://beginnersbook.com/2013/05/method-overloading/
	
		 
		       DisplayOverloading obj = new DisplayOverloading();
		       obj.disp('a'); //obj.disp('a')
		       obj.disp('a',10);//obj.disp('a',10)//overloading  with difference in number of parameters
	obj.disp(12.34f);
	obj.disp(12);
	obj.disp(12.56f, 3);
	obj.disp(12, 12.56f);
	
	//method overloading and type promotion
	
	obj.disp(100, 20.67f);//here method A called as the float is promoted to the double but if there is 
	//method C which has float then there wont be promotion
	
	

	}


}
