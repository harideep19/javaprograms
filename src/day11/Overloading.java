package day11;

public class Overloading {
	int x,y,z; // 
	double d;  
	void sum(){  //default method
		
		x=200;
		y=300;
		z=400;
		d=10.5;
		System.out.println(x+y+z+d);
	}
	void sum(int a,int b) {
		x=a;
		y=b;
		System.out.println(x+y);
	}
	void sum(int b,double a) {
		x=b;
		d=a;
		System.out.println(x+d);
	}
	void sum(int a,int b,int c) {
		x=a;
		y=b;
		z=c;
		System.out.println(x+y+z);
	}
	void sum(double a,int b,int c) {
		d=a;
		y=b;
		z=c;
		System.out.println(d+y+z);
	}
	void sum(int a,double e,int c) {
		x=a;
		d=e;
		z=c;
		System.out.println(x+d+z);
	}
	//without overloading
void sum1(){  //default method
		
		x=200;
		y=300;
		z=400;
		d=10.5;
		System.out.println(x+y+z+d);
	}
	void sum2(int a,int b) {
		x=a;
		y=b;
		System.out.println(x+y);
	}
	void sum3(int b,double a) {
		x=b;
		d=a;
		System.out.println(x+d);
	}

	public static void main(String[] args) {
		Overloading res = new Overloading();
		{
			res.sum(1.5, 2, 3);

		}
		
			
		}
		
		
	}


