package day7;

public class Methods {
	
	void add(int a,int b)
	
	{
		System.out.println(a+b);
	}
		void mul(int a,int b) 
		{
	System.out.println(a*b);
		}
		void sub(int a,int b,int c){
			
		System.out.println(a-b-c);
	}

	public static void main(String[] args)
	{
		
		
	  Methods	m= new Methods();
	  m.add(2, 5);
	  m.sub(10, 20, 30);
	  m.mul(5, 20);
	}
}
