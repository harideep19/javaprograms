package Assignments;

public class Palindrome {

	public static void main(String[] args) {
		int num =121;
		int rem;
		 int res=0;
		 int temp;
		 temp=num; //
		
		while(num>0) {
			rem = num%10;
			res= res*10+rem;
			
			num=num/10;
		}
		if(temp==res) {
			System.out.println("the number is Palindrome ");	
		
		}else {
			System.out.println("not a Palindrome");
		}
		
		
		
		}
		
	}


