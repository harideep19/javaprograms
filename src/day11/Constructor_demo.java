package day11;

public class Constructor_demo {
	int x,y;
	String str;
	double dob;
	
	Constructor_demo(){ //default constructor
	 x=500;
	 y=300;
	 str="harideep";
	}
		Constructor_demo(int a,int b,String r){ //1
			 x=a;
			 y=b;
			 str=r;
			 
		
	}
		Constructor_demo(String r,int a,int b){//2
			 x=a;
			 y=b;
			 str=r;
		}
		Constructor_demo(int a,int b){//3
			 x=a;
			 y=b;
			 
		}
		Constructor_demo(double d,int a,int b){ //4
			 x=a;
			 y=b;
			 dob=d;
		}
		
		
   void	display(){
		System.out.println(x+y);
		System.out.println(y);
		System.out.println(str);
	}
	

	public static void main(String[] args) {
		Constructor_demo res= new Constructor_demo();
		Constructor_demo res1= new Constructor_demo(20.5,20,30);
		res.display();
		res1.display();
		
			
		
	}

}
