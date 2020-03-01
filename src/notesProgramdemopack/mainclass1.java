package notesProgramdemopack;

import java.util.Scanner;

public class mainclass1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=s.nextInt();
		System.out.println("etner the value of b");
		int b=s.nextInt();
		superclass1 obj=new subclass1(a,b);//generalization
	//	subclass1 obj=new subclass1(a,b);
		obj.calculate();
		obj.dis();
		
		

	}

}
