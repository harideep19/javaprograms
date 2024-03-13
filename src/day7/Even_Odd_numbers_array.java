package day7;

public class Even_Odd_numbers_array {
	public static void main(String[] args) {
		
//		int num[]= {2,8,4,6,5,7,9};
//		int even=0;
//		int odd=0;
//		int store;
//	
//		
//		for (int i=0;i<=6;i++) {
//			
//			store =num[i]%10;
//			
//			if(num[i]%2==0) {
//				even++;		
//			}
//		} 
//
//		
//			for (int i=0;i<=6;i++) {
//				 store =num[i]%10;
//					 if (num[i]%2!=0) {
//						 odd++;
//					 }
//				 
//			}
//			 System.out.println("number of even:"+even);
//				System.out.println("number of odd:"+odd);
//				
//				
//				
//				
//				
//				int a[]= {1,2,3,4,5};
//				int evencount=0;
//				int oddcount=0;
//				
//				for( int i=0;i<=4;i++) {
//					if(a[i]%2==0) {
//						evencount++;
//				}
//					else {
//						oddcount++;
//						a[i]=a[i]/10;
//					}
//			}
//				
//				System.out.println("number of even:"+evencount);
//				System.out.println("number of odd:"+oddcount);
//			
			int a[]= {5,4,6,8,2,4};
				int even=0;
				int odd=0;
				int store;
				
				for(int i=0;i<=5;i++) {
					if(a[i]%2==0) {
						even++;
					}
				else {
					odd++;
				}
				
				
				a[i]=a[i]/10;
				}
				System.out.println("even count:"+even);
				System.out.println("odd count:"+odd);
				
           
}
}