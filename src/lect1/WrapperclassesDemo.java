package lect1;

import java.util.Scanner;

public class WrapperclassesDemo {

	public static void main(String[] args) {
		
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the int value1(string)");
		String s1=s.nextLine();
//boxing wither via constructor or using value of method
//here will get number format exception if we enter text instead of the numbers for the string value
Integer obj1=new Integer(s1);
System.out.println("---------After boxing process");
System.out.println("obj1="+obj1);

int b=obj1.intValue();
System.out.println("---------After unboxing process");
System.out.println("b="+b);
//ie from string s1 to INT obj1 and then to int b ie from PSO to WCO and from WCO to PDT
/*int number 3=new Integer(str).intValue();(PDT to WCO and WCO to PDT)
Ex: int a=121;
Integer obj1= new Integer(a); PDT to WCo
Int b=obj1.intValue(); WCO to PDT */
//string converted to integer value as an example above
 
//below example is from pDT (int ) to WCO(Integer) and to String(PSO)
System.out.println("enter the int value");
int a=s.nextInt();
Integer obj2=new Integer(a);
System.out.println("---------After boxing process");
System.out.println("obj2="+obj2);
String s2=obj2.toString();//converted to string value
System.out.println("---------After unboxing process");
System.out.println("s2="+s2);


//float examples
float f1=12.34f;

Float obj3=new Float(f1);
double d1=56.58;
Float obj4=new Float(d1);
String s3="123.45";

Float obj5=new Float(s3);
System.out.println("---------After boxing process");
System.out.println("obj3="+obj3);
System.out.println("obj4="+obj4);
System.out.println("obj5="+obj5);

float f2=obj3.floatValue();
double d2=obj4.doubleValue();
String s4=obj5.toString();
System.out.println("---------After unboxing process");
System.out.println("f2="+f2);
System.out.println("d2="+d2);
System.out.println("s4="+s4);

//char example is :
char ch1='K';
Character obj6=new Character(ch1);
System.out.println(" after unboxing="+obj6);
char ch2=obj6.charValue();
System.out.println("primitive ch2 after unboxing="+ch2);

//autoboxing and autounboxing examples below

int i=100;
Integer ab=i;// this is autoboxing  primitive to wrapper--now JVM  write internally as Integer ab=Integer.value of(i);

Integer j=new Integer(10);//wrapping using constructor//explicit boxing
int abc=j.intValue();//explicit unboxing of wrapper to primitive--suport wth the help of methods
int k=j;// auto unboxing //autounboxing wrapper to primitive

//case 1 PDT to WCO
int x=121;
Integer obj7=new Integer(a);
//or
Integer obj8=Integer.valueOf(a);

//case 2 WCO to PDT
 int y=obj7.intValue();
 
 //case 3 PSO to WCO
 String s5="122";
 Integer obj9=new Integer(s5);
//case 4 WCO to PSO
 
 String s6=obj9.toString();
 
 //case 5 PDT to PSO
 String s7="124";//autoboxing what JVM internally writes for this? 
 String s8 = "10.02";  
 String s9 = String.valueOf(s8);    
 System.out.println(s9);//may be this way it is autoboxing converting string to string
 
 //case 6 PSO to PDT
 
 int z=Integer.parseInt(s7);
 
 //parse Int is static method which returns the primitive value--parse string to int
 
 
/* Ways to convert String to Integer/int
 String str=”1234”;
 1.int number =Integer.parseInt(str);// returns an primtive int for parseint 
 //for float it is ParseFloat(str)
 syso(“convert using Integer.parseInt()....”+number) this is Primitive string object to primitve data type

2. Int number 2=Integer.valueof(str);//value of returns an Integer object
 int number 3=new Integer(str).intValue();(PDT to WCO and WCO to PDT)
 Ex: int a=121;
3. Integer obj1= new Integer(a); PDT to WCo this will convert string to Int
 int b=obj1.intValue(); WCO to PDT and this will conver Int to int
*/

		 



	}

}
