package day18;

import java.util.Scanner;

public class Using_Scannerclass {

	public static void main(String[] args) {
		System.out.println("program started...");
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enetr a numbSystem.out.println(\"program starteder");
		 int num=sc.nextInt();
		try {    
		 System.out.println(100/num);
		}
		catch(ArrayIndexOutOfBoundsException e)
		//catch(Exception e)
		{
			e.getStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Invalid data provided");
			
			
		}


	}

}
