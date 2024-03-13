package Day6;

import java.util.Arrays;

public class Object_array {

	public static void main(String[] args) {
		Object a[] = new Object[6];
		a[0]=100;
		a[1]="welcome";
		a[3]=1.5;
		a[4]='a';
		a[5]=true;
		System.out.println(a[5]);
		System.out.println(Arrays.toString(a));
	}

}
