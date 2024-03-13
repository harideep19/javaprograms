package Day5;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int num=1234;
		int rem;
		int res=0;
		 
		 while (num > 0) {
			 rem = num % 10;
			 res = (res * 10) +rem;
			 num = num / 10;
		 }
			 System.out.println("Reversed number:" + res);
			 
			 
		
			 Scanner sc = new Scanner(System.in);
//			 System.out.println("enter number to reverse");
//			int num1=sc.nextInt();
			int num1=456987;
			 int rem1;
			 int res1=0;
			 
			 while(num1>0) {
				 rem1=num1%10;
				 res1=res1*10+rem1;
				 num1=num1/10;
			 }
			 System.out.println(num1);
			 
			 String str="harideep";
			 String rev="";
			 int len=str.length();
			 
			 for(int i=len-1;i>=0;i--) {
				 rev=rev+str.charAt(i);
			 }	  
				System.out.println(rev); 
			 
		 }
	

	}



