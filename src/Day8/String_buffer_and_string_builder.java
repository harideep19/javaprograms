package Day8;

import java.util.Scanner;

public class String_buffer_and_string_builder {

	public static void main(String[] args) {
//		StringBuffer str=new StringBuffer("Harideep");
//		  System.out.println(str.reverse());
//		  
//		  
//		  StringBuilder str1=new StringBuilder("Harideep");
//		 System.out.println(str1.reverse());
//		 
		 
		 
		 StringBuffer SB= new StringBuffer("HArideep");
		 System.out.println(SB.reverse());
		 StringBuilder SB1 = new StringBuilder("Mani") ;
		System.out.println( SB1.reverse());
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		//String str ="Ayyan";
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
		rev	=rev+str.charAt(i);
		}
		System.out.println(rev);
		 
	}

}
