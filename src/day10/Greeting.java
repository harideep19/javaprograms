package day10;

public class Greeting {

	// 1. no params no return value
	void Greeting1(){
		System.out.println("hello");
	}
	// 2 no params return value
	String Greeting2(){
		
		return("hello second");
	}
	// params no return value
	void Greeting3(String name){
		
		System.out.println("hello"+name);
		
	}
	// params return value
	String Greeting4(String name){
		return("Hello"+name);
	}

	public static void main(String[] args) {
		
		Greeting grt=new Greeting();
		grt.Greeting1();
		 String str=grt.Greeting2(); // System.out.println(grt.Greeting2)
		 System.out.println(str);
		 grt.Greeting3(" Harideep");
		System.out.println(grt.Greeting4("Harideep"));
		
		String str1="welcome";
		 System.out.println(str1.length()); // no params   return value
		 System.out.println(str1.charAt(4)); // take params  return value
		
		 
		 
		
	}

}
