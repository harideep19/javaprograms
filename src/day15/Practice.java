package day15;

interface cricket{
	int a=10;
	double d=30;
	
	void ab();
	default void m1()
	{
		System.out.println("default");
	}
	static void m2() {
		System.out.println("static");
	}
	
}

public class Practice implements cricket {
	
	public void ab() {
		System.out.println("implemented");
	}

	public static void main(String[] args) {
		
		Practice p1 = new Practice();
		p1.ab();
		p1.m1();
		cricket.m2();
		

	}

}
