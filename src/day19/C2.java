package day19;

public class C2 {

	private int a=10,b=10; // we can access private variables with in the its class itself not outside 
	private void m1()
	
   //  void m2()  //we can call access the default method within the class and another class 
	{
		System.out.println(a+b);
	}
	protected int c=10,d=20;
	protected void m2() {
	System.out.println(c+d);
	}

	public static void main(String[] args) {
		C2 c =new C2();
		c.m1();
		
		c.m2();
		
		
	//	c.m1();
	//	c.m2();
		
		
		
		
	}

}
