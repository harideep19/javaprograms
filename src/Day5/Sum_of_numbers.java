package Day5;

public class Sum_of_numbers {

	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		int temp;
		while(num>0) {
			temp=num%10; //4
			sum=sum+temp;
			num=num/10;
		}
		System.out.println(sum);
		
		
		
		int n1 = 145874;
		int sum1=0;
		int temp1;
		
		while(n1>0) {
			temp1=n1%10;
			sum1=sum1+temp1;
			n1=n1/10;
			
		}
		System.out.println(sum1);
		
		int n2=5254265;
		int s1;
		int i1=0;
		while(n2>0){
			s1=n2%10;
			i1=i1+s1;
			n2=n2/10;
		}
		System.out.println(i1);
	}

}
