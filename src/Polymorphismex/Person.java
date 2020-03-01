package Polymorphismex;

import java.security.PublicKey;

public class Person {
	
int id;
String name;
public Person(int id,String name)
{
	this.id=id;//this refers to the global var , current running class
	this.name=name;
}



}
