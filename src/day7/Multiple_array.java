package day7;

public class Multiple_array {

	public static void main(String[] args) {
		
		int a[][]=new int [3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][1]=500;
		System.out.println(a.length);
		System.out.println(a[1].length);
		System.out.println(a[0][0]);
		
		// approach2
		int s[][]= {{100,200}, //
				    {300,400},
				    {500,600}};
	//	System.out.println(s.length);
		//System.out.println(s[1].length);
		//System.out.println(s[0][0]);
		//for ( int r=0; r<=2; r++) {
			//for (int c=0; c<=1; c++) {
				//System.out.println(s[r][c]);
	//}
	//}
		   for (int x[]:s) {
			   for (int h:x) {
				   System.out.println(h);
		
	}

		   }
		   int b[][]= new int[3][2];
		   
		   b[0][0]=100;
		   b[0][1]=200;
		   b[1][0]=300;
		   b[1][1]=400;
		   b[1][1]=500;
		   b[2][1]=600;
		   
		   System.out.println(b.length);
		   
		   int s1[][]= {{100,200},
				   {300,400},
				   {500,600}};
		   
		   
		  System.out.println( s1.length);
		   
		   
		   
		   
}
}
