package Day5;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int num=sc.nextInt();
		int b=sc.nextByte();
		
		int sum=0;
		int temp;
		while(num>0) {
			temp=num%10; //4
			sum=sum+temp;
			num=num/10;
		}
		System.out.println(sum);
			}
		

	}

