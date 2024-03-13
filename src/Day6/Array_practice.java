package Day6;

public class Array_practice {

	public static void main(String[] args) {
		
	        
		int a[]= {10,26,4,6,25,30};
		int largest = a[0];
		for (int i=1;i<=a.length-1;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		System.out.println("largest array is:"+largest);
		
   

 
	 }
		}
