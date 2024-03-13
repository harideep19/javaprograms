package Day4;

import java.util.Scanner;

public class Nested_if_else {

	public static void main(String[] args) {
//		int weekno=6;
//		if (weekno>=1&& weekno<=7) {
//			if (weekno==1) {
//				System.out.println("sunday");
//				}
//			else if (weekno==2) {
//				System.out.println("Monday");
//							}
//				else if (weekno==3) {
//				System.out.println("teusday");
//							}
//				else if(weekno==4) {
//				System.out.println("wednesday");
//							}
//				else if (weekno==5) {
//				System.out.println("thursday");
//							}
//				else if (weekno==6) {
//				System.out.println("friday");
//								
//							}
//				else if (weekno==7) {
//				System.out.println("saturday");
//							}
//		} else {
//				System.out.println("out of range");
//							}
						
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter month number");
		int month=sc.nextInt();
		
		//int month =12;
		
		if(month>=1&&month<=12) {
			
			if(month==1) {
				System.out.println("january");
			}
			else if(month==2) {
				System.out.println("febuary");
				
			}
			else if(month==3) {
				System.out.println("march");
				
			}
			else if(month==4) {
				System.out.println("april");
				
			}
			else if(month==5) {
				System.out.println("may");
				
			}
			else if(month==6) {
				System.out.println("june");
				
			}
			else if(month==7) {
				System.out.println("july");
				
			}
			else if(month==8) {
				System.out.println("august");
				
			}
			else if(month==9) {
				System.out.println("september");
				
			}
			else if(month==10) {
				System.out.println("octmber");
				
			}
			else if(month==11) {
				System.out.println("novmber");
				
			}
			else if(month==12) {
				System.out.println("december");
				
			}
		} 
		else {
			System.out.println("out of range");
		}
		
		
		
		
	}
	}


				


			
		