package Assignments;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the day number");
		int day=sc.nextInt();
		if(day<=5) {
			System.out.println("week day");
		}
		else {
			System.out.println("week end");
		}

	}

}
