package interfaceexamples;

public class child1 extends Parent1class implements parent1,parent2 {

	/*@Override
	public void show() {
		// TODO Auto-generated method stub
		//show method belongs t the child class and can definition here
		System.out.println("show from the child1");
	}*/

public static void main(String[] args)
{
	child1 c=new child1();
	c.show();
	Parent1class p=new Parent1class();
	p.show();
	
	parent1 c1=new child1();
	c1.show();
	
	
}

}
