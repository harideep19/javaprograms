package day15;

interface shape

{
	int length =20;// final and static
	int width = 40;// final and static
	void circle(); // abstract method it is also called unimplemented method
	default void square()
	{
		System.out.println("default");
	}
	static void rectangle() {
		System.out.println("static");
		
	}

}

public class Interface_demo implements shape {
	
	public void circle() {
		System.out.println("implemented");
	}
//	void tri()
//	{
//		System.out.println("triangle");
//	}
//	
//	public void circle()
//	{
//		System.out.println("abstract");
//	}

	public static void main(String[] args) {
		Interface_demo id= new Interface_demo();
		id.circle();
		id.square();
		//id.tri();
		shape.rectangle();
		shape sh = new Interface_demo(); // we can create obj reference to interface
		sh.circle();
		sh.square();
		shape.rectangle();
		

	}
	
}
