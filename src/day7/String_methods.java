package day7;

public class String_methods {

	public static void main(String[] args) {
//		String s ="welcome";
//		String s1 =new String ("welcome");
//		
//		//length ()
//		System.out.println(s1.length());
//		//concat()
//		String s2="Hari    ";
//		String s3 ="Deep";
//		String s4 =" Aepuri";
//		System.out.println(s2+s3+s4);
//		
//		String store =s2.concat(s3).concat(s4);
//		System.out.println(store);
//		System.out.println("hari".concat("deep"));
//			// trim () to remove spaces
//		System.out.println(s2.length());
//		System.out.println(s2.trim());
//		
//		//CharAt() gives the specified character
//		 char s0=s2.charAt(2);
//		 System.out.println(s0);
//		 //contains() returns the boolean values
//		 System.out.println(s2.contains("ha"));
//		 System.out.println(s2.contains("Ha"));
//		 System.out.println(s2.contains("hi"));
//		 // equals and equal ignores ()
//		 String s5="welcome to india";
//		 String s6 ="Welcome";
//		System.out.println(s2.equals(s3));
//		System.out.println(s5.equalsIgnoreCase(s6));
//		//replace(): It will replace the single/sequence characters in string
//		System.out.println(s5.replace('c', 'o'));
//		System.out.println(s5.replace("india", "china"));
//		
		String Str="Harideep";
		String S2 = new String("Harideep");
	System.out.println(	S2.length());
	
	String s1="HariDeep";
	String s2="Hari";
	String s3="Aepuri   ";
	System.out.println(s1.concat(s2).concat(s3));
	
	System.out.println(s3.length());
	System.out.println(s3.trim());
	
	System.out.println( s2.charAt(2));
	
	System.out.println(s3.contains("pu"));
	
	 System.out.println(s1.equals(s3));
	 System.out.println( s1.equalsIgnoreCase(s2));
	 
	System.out.println( s2.replace('a', 'b'));
	

	}

}
