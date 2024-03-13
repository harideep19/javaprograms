package Day5;

public class Number_of_odd_even {

	public static void main(String[] args) {
		
//		int num=125478;
//		int odd=0;
//		int even=0;
//		int store;
//		
//		while(num>0) {
//			store=	num%10;
//		   if(num%2==0) {
//			   even++;
//		   }
//		   else {
//			   odd++;
//		   }
//		   num=num/10;
//	}
//		System.out.println("number of even:"+even);
//		System.out.println("number of odd:"+odd);
		
		
		
		int num1=145878;
		int s1;
		int even1=0;
		int odd1=0;
		
		while(num1>0) {
			s1=num1%10;
			if(num1%2==0) {
				even1++;
			}
			else {
				odd1++;
			}
			num1=num1/10;
		}
		System.out.println("number of even:"+even1);
		System.out.println("number of odd:"+odd1);
		
		int n1=15;
		if(n1%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
	}

}
