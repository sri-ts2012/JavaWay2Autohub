package Polymorphismex;

public class DisplayOverloading {
	//diff in number of parameters
	public void disp(char c)  
    {
         System.out.println(c);
    }
	
	
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
    //--------------------------- diff in type of paramters
    public void disp(float c)
    {
        System.out.println(c);
    }
    public void disp(int c)
    {
       System.out.println(c );
    }
//diff in sequence of parameters
public void disp(float c, int num)
    {
        System.out.println("I’m the first definition of method disp");
    }
    public void disp(int num,float c)
    {
        System.out.println("I’m the second definition of method disp" );
    }
    //method overloading and type promotion
    void disp(int a, double b){
    	System.out.println("Method A");
       }
       void disp(int a, double b, double c){
    	System.out.println("Method B");
       }
       
      /* void disp(int a, float b){
    		System.out.println("Method C");
    	   }*/

       
   	//valid/invalid examples:
   	/*int mymethod(int a, int b, float c)
   	int mymethod(int var1, int var2, float var3)//Result: Compile time error. Argument lists are exactly same. Both methods are having same number, data types and same sequence of data types.
}*/

       /*case 2:

    	   int mymethod(int a, int b)
    	   int mymethod(float var1, float var2) */
       //Result: Perfectly fine. Valid case of overloading. Here data types of arguments are different.

       /*Case 3:

    	   int mymethod(int a, int b)
    	   int mymethod(int num)
    	   Result: Perfectly fine. Valid case of overloading. Here number of arguments are different.*/
      /* Case 4:

    	   float mymethod(int a, float b)
    	   float mymethod(float var1, int var2)
    	   Result: Perfectly fine. Valid case of overloading. Sequence of the data types of parameters are different, first method is having (int, float) and second is having (float, int).
*/

      /* Case 5:

    	   int mymethod(int a, int b)
    	   float mymethod(int var1, int var2)
    	   Result: Compile time error. Argument lists are exactly same. Even though return type of methods are different, it is not a valid case. Since return type of method doesn’t matter while overloading a method.
*/
       //cannot overload only on static keyword difference
   /* // filename Test.java
       public class Test {
           public static void foo() {
               System.out.println("Test.foo() called ");
           }
           public void foo() { // Compiler Error: cannot redefine foo()
               System.out.println("Test.foo() called ");
           }
           public static void main(String args[]) { 
               Test.foo();
           }
       }*/

}