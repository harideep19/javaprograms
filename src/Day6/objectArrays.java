package Day6;

import java.util.Arrays;

public class objectArrays {

	public static void main(String[] args) {
		Object a[]=new Object[5];
		a[0]=100;
		a[1]="welcome";
		a[2]='a';
		a[3]=40.1;
		a[4]=true;
		
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));

	}

}
