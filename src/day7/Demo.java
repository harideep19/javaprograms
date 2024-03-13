package day7;

import java.util.Arrays;
import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		/*int a[]= {1,5,9,7,5,3};
		int sum=0;
		
		for (int i=0;i<=5;i++) {
			sum=sum+a[i];
			
		}
		System.out.println(sum);*/
		
		// average numbers
		
		/*int b[] = {1,2,3,4,5,6,7,8,9};
		int add=0;
		int avg;
		for(int i=0;i<=8;i++) {
			add=add+b[i];
		}
		avg = add/b.length;
		
		System.out.println(avg);*/
		
		
			/*int a[]= {2,4,5,6,9,8};
			int i=0;
			int j=4;
			int temp;
			while(i<j) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
				System.out.println(Arrays.toString(a));*/
				
			
			
			//common elements in two arrays
				
				/*int arr1[]= {10,20,30,4,50,60};
				int arr2[]= {70,80,5,4,20,66,60};
				HashSet c= new HashSet();
				
				for(int i=0;i<=arr1.length-1;i++) {
					for (int j=0;j<=arr2.length-1;j++) {
						
						if(arr1[i]==arr2[j]) {
							c.add(arr1[i]);
		                }
		            }
		        }

		        // Print the common elements.
		        System.out.println("Common element : " + (c));*/
					
				// factorial of a number 	
				int fact =1;
				int n=5;
				for(int i=1;i<=n;i++) {
					fact=fact*i;
					
				}
				System.out.println(fact);
				
				//fibnacci serics 
		
	
	
	
	
	}

}
