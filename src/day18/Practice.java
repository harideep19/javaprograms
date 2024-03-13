package day18;

public class Practice {

	public static void main(String[] args) {
		String str =null;
		int a[]= {1,2,3,4,5,6};
		int A=10 ,b=20;
		
		try {
			System.out.println(A/0);
		System.out.println(str.charAt(2));
		System.out.println(a[6]);
		}
		catch (ArithmeticException e) {
			System.out.println("find");
		}
		catch(NullPointerException e) {
			System.out.println("find");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("find");
		}
	
		
	}
}