package Day5;

public class Count_number_digits {

	public static void main(String[] args) {
		
		int n=423424;
		int i=0;
		int rem;
		
		while(n>0) {
			rem=n%10;
			i=i+1;
			n=n/10;
			
		}
		System.out.println(i);
		
		
		int num=123654789;
		int s1;
		int res=0;
		while(num>0) {
			s1=num%10;
			res=res+1;
			num=num/10;
			
		}
		System.out.println(res);
		
		int n2=124578963;
		int s2;
		int i1=0;
		while(n2>0)
		{
			s2=n2%10;
			i1=i1+1;
			n2=n2/10;
		}
		System.out.println(i1);
		
		
		
}
}
