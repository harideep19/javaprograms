package day11;

public class Practice {
	
//	int a;
//	int b;
//	double d;
//	String str;
//	Practice () {
//		a=20;
//		b=30;	
//	}
//	Practice (int x,int y) {
//		a=x;
//		b=y;
//		
//	}
//	Practice (int y,String s,double o) {
//		b=y;
//		str=s;
//		d=o;
//	}
//	Practice (String s,double f,int g) {
//		str=s;
//		d=f;
//		b=g;
//	}
//	void display(){
//		System.out.println(a+b);
//		
//		//System.out.println(b+str+d);
//		
//	}
//
//	public static void main(String[] args) {
//		Practice res = new Practice();
//		Practice res1 = new Practice(10,45);
//		
//		res.display();
//		res1.display();
		
		// overloading
		
				int n1;
				int n2;
				String str1;
				
				void m1() {
					n1=10;
					n2=30;
					str1="Harideep";
					System.out.println(n1+n2+str1);
					
				}
				void m1(int a,int b) {
					n1=a;
					n2=b;
					System.out.println(n1+n2);
	}
				void m1(int b,String s) {
					n2=b;
					str1=s;
					System.out.println(n2+str1);
				}
				public static void main(String[] args) {
				Practice res = new Practice();
				res.m1();
				res.m1(10, 20);
				res.m1(10, "mani");
				
				
}
}