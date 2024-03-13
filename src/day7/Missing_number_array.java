package day7;

public class Missing_number_array {
	public static void main(String[] args) {
		int a[]= {1,2,4,5,6,7,8,9,10};
		int sum=0;
		int sum1=0;
		
		for (int i=0;i<=8;i++) {
			sum=sum+a[i];
		}
			System.out.println("sum of elements:"+sum);
			
			for(int i =0;i<=9;i++) {
				sum1=sum1+i;
				
			}
			System.out.println("sum of elements:"+sum1);
			System.out.println("missing elements is:"+(sum1-sum));
	}
	
}
