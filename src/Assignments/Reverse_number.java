package Assignments;

public class Reverse_number {

	public static void main(String[] args) {
		
		int num=1234;
		int rem;
		int res=0;
		
		while (num>0){
			
		rem = num % 10;
		res = (res * 10)+rem;
		num =num/10;
		
		
		 }
			 System.out.println("Reversed number:" + res);
			 
			 

	}

}
