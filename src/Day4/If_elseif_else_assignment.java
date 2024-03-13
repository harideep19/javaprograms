package Day4;

public class If_elseif_else_assignment {

	public static void main(String[] args) {
		int a=100,b=200;
		if(a>b) {
			System.out.println("a is largest number");
		}
		else {
			System.out.println("b is largest number");
		}
		
		
	//ternary method
	
			//String res= (a>b)? "a is largest":"b is largest";
			//System.out.println(res);
		
		
		int x=20,y=30,z=40;
		if (x<y&&x<z) {
			System.out.println("the smallest number is :"+x);
		}
		else if (x>y&&y>z) {
			System.out.println("The smallest nunmber is:"+y);
		}
		else {
			System.out.println("the smallest number is :"+z);
		}
		
		int c=20,d=30,f=40;
		
		if(c>b&&c>f) {
			System.out.println("grater number is :"+c);
			
			
		}
		else if (c<b&&d>f) {
			System.out.println("grater number is:"+d);
			
		}
			
		else {
			System.out.println("grater umber is:"+f);
			
		}
	
	}
}
	
	
