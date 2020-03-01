package notesProgramdemopack;

public abstract class superclass1 {
	int a,b,c;//global across all the classes
	public superclass1(int a, int b) {
		this.a=a;
		System.out.println("print after a gets the value");
		this.b=b;
		System.out.println("print after b gets the value");
	}


	
		abstract void calculate();
		void dis()
		{
			System.out.println("The sum="+c);
		}
	}
	


