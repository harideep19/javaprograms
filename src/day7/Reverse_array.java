package day7;

import java.util.Arrays;

public class Reverse_array {

	public static void main(String[] args) {
		
		
		
//		int a[] = {1, 2, 3, 4, 5};
//		int i= 0;
//		int j=a.length-1;
//		int temp;
//		while(i<j) {
//			temp = a[i];
//			a[i]=a[j];
//			a[j]=temp;
//			i++;
//			j--;
//		}
//		System.out.println(Arrays.toString(a));
		
		int b[]= {1,5,7,6,8,4,5};
		int i=0;
		int j=b.length-1;
		int temp;
		
		while(i<j) {
			temp=b[i];
			b[i]=b[j];
			b[j]=temp;
			i++;
			j--;		
		}
		System.out.println(Arrays.toString(b));
		
		int c[]= {1,2,3,4,5,6,7,8,9};
		int i1=0;
		int j2=c.length-1;
		int tem;
		while(i1<j2) {
			tem=c[i1];
			c[i1]=c[j2];
			c[j2]=tem;
			i1++;
			j2--;
		}
		System.out.println(Arrays.toString(c));
	}

}
