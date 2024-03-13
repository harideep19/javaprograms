package Day8;

public class Immutable {

	public static void main(String[] args) {
		
		//Reverse_string1.reverse("madhuri"); // when it is in static class
		
		Reverse_string1 call=new Reverse_string1(); // non static
		call.reverse("ayyan");
		
		 String str =new String("Hari");
	     str.concat("deep");
	     String str1=str.concat("deep");
		 System.out.println(str);
		 System.out.println(str1);
		
		
		StringBuffer strb= new StringBuffer("Harideep");
		strb.reverse();
		//strb.append("Aepuri");
		System.out.println(strb);
		StringBuilder strb1= new StringBuilder("Harideep");
		strb1.append("Aepuri");
		System.out.println(strb1);
		
		StringBuffer strb12=new StringBuffer("srinivas");
		strb12.reverse();
		System.out.println(strb12);
		strb12.append("aepuri");
		System.out.println(strb12);
	}

}
