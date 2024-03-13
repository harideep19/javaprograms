package day14;

public class Human {
	String color ="white";
	void eat()
	{
		System.out.println("eating");
		
	}
	

}
class dog extends Human
{
	String color = "black";
	void eat()
	{
		//super.eat(); // super will call the immediate superclass or parent class 
		System.out.println("eats bread");
	}
	

}
class cat extends dog
{
	 String color="red";
	void eat() {
		super.eat();
		System.out.println("drinks milk");
	}
	void display()
	{
		super.eat();
		System.out.println(super.color);
	}
}
