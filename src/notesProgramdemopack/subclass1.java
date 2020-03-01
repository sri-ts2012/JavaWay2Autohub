package notesProgramdemopack;

public class subclass1 extends superclass1 {
	
subclass1(int a, int b)
{
	super(a,b);
	System.out.println("print after super ");
}
void calculate()
{
	c=a+b;
	System.out.println("print after calc"+c);
}
}
