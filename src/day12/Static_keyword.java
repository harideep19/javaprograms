package day12;

public class Static_keyword {
	static int a=20;
	int b=25;
	
	static void m1() {  // static method will access static variables directly
		System.out.println("static method");
	}
	void m2() {  // static methods can access non-static stuff through object and non-static methods can access everything directly.

		System.out.println(a);
		System.out.println(b);
		m1();
		System.out.println("non static");
	}

	public static void main(String[] args) {
		System.out.println(a);
		Static_keyword.m1();
		
		Static_keyword kw = new Static_keyword();
			System.out.println(kw.b);
			kw.m2();
			
		
		
	}

}
