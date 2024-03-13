package day14;

//class c1{
//	int a=10;
//	int b=20;
//	void m1(int a,int b) {
//		System.out.println(a+b);
//	}
//	void m2(int b) {
//		System.out.println(b);
//	}
//}
//class c2  extends c1{
//	void m1(int a,int b) {
//		System.out.println(a*b);
//		
//	}
//	void m2(String a) {
//		System.out.println(b);
//	}
//}
//
//
public class Practice {
	String str="black";
	void eat() {
		System.out.println("eat");
	}
	
	class fun extends Practice{
		String str="blue";
		void eat() {
			System.out.println("sky is blue");
		}
	}
	class cat extends fun{
		String str="red";
		void eat() {
			super.eat();
			System.out.println("hat is red");
		}
		void display() {
			super.eat();
			System.out.println(super.str);
		}
	}
	
	


	public static void main(String[] args) {
		
		
		
		// cat H = new cat();
//		c2 res = new c2();
//		res.m1(20, 30);
//		res.m2(20);
//		
//		res.m2("a");
		
		

		
		
		
	}
		
	}
		
		

	


