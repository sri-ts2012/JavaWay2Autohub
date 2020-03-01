package accessdemo2;

import accessdemo.accessdemo1testchild;

public class Accessdemotestparent {

	public int publicVariable=10;
	private int privateVariable=20;
	protected int protectedVariable=30;
	int defaultVariable=40;
	
	public static void main(String[] args) {
		
		Accessdemotestparent obj = new Accessdemotestparent();
		accessdemo1testchild obj1 = new accessdemo1testchild();
		System.out.println(obj.privateVariable);
		System.out.println(obj.publicVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
		
		
	}



}
