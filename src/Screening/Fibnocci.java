package Screening;

public class Fibnocci {

	public static void main(String[] args) {
		
		int n=5;
		int a=0,b=1,c = 0 ;
		
		for(int i=0;i<=n;i++) {
			c=a+b;
			
			System.out.println(c+"");
			
			a=b;
			b=c;

		}
		
	}

}
