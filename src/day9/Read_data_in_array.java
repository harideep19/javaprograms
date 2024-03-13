package day9;

import java.util.Scanner;

public class Read_data_in_array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]= new int[6];
		for(int i=0;i<=5;i++) {
			System.out.println("enter " +i+"value");
			a[i]=sc.nextInt();
			
		}
		for (int i=0;i<=5;i++) {
			System.out.println(a[i]);
		
		}
	}

}
