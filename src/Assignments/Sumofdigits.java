package Assignments;

public class Sumofdigits {

	public static void main(String[] args) {
		
		int num=2546987;
		int sum=0;
		int store;
		
		while(num>0) {
			store=num%10;
			sum=sum+store;
			num=num/10;
			
		}
		System.out.println(sum);

	}

}
