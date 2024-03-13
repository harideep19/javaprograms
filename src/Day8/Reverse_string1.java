package Day8;

public class Reverse_string1 {
	
	   void reverse(String str) {  // if it is static no need to call with class name
	   
	   String rev="";
	   int len=str.length();
	   for (int i=len-1;i>=0;i--) {
		   rev=rev+str.charAt(i);
		  // rev=rev+str.toCharArray()
	   }
	   System.out.println(rev);
	   
	  }

	public static void main(String[] args) {
		
	
		Reverse_string1 call=new Reverse_string1(); // if static no need call this class
		call.reverse("Harideep");
		//reverse("Harideep");
	}	
	 

}
