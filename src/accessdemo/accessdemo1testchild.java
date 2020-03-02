package accessdemo;

import accessdemo2.Accessdemotestparent;

public class accessdemo1testchild extends Accessdemotestparent   {


	public static void main(String[] args) {
		

				/*
				 * Inheritance - one class object will inherit other class properties
				 * extends, implements
				 * A, B
				 * A extends B
				 * 
				 */

		accessdemo1testchild obj = new accessdemo1testchild();
		Accessdemotestparent obj2=new Accessdemotestparent();
		
				//System.out.println(obj.privateVariable);
				System.out.println(obj.publicVariable);
				System.out.println(obj.protectedVariable);
				//removing this as comment to test the merge conflict scenario as the original user x has this line of code
				//System.out.println("printing this for gitdemo");
				System.out.println("printing this from the project y workspace_NewProjects");
			//System.out.println(obj.defaultVariable);
			
		
				

			}

	


	}


