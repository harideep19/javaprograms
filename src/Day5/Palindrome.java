package Day5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
//		int num=454;
//		int A=0;
//		int s;
//		int temp;
//		
//		temp=num;
//		
//		while (num>0) {
//			s=num%10;
//			A=A*10+s;
//			num=num/10;
//		}
//		if(temp==A) {
//			System.out.println("palidrome number");
//		}
//		else {
//			System.out.println("non palidrone number");
//		}
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int num1=sc.nextInt();
		//int num1=454;
		
		int store;
		
		int res=0;
		int temp1;		
		
		temp1=num1;
		
		while(num1>0) {
			store=num1%10;
			res=res*10+store;
			num1=num1/10;
		}
		
		if(temp1==res) {
			System.out.println("the number is palidrone");
			
		} else {
		
			System.out.println("not a polidrone");
		}
	}
}