package day16;

abstract class Abstract_class {
	void m1()
	{
		System.out.println("abstract method");
		
	}
	abstract void m2();
}

	class normal extends Abstract_class {

		@Override
		void m2() {
			System.out.println("abst");
			
		}
		
	
	public static void main(String[] args) {
		//Abstract_class res = new Abstract_class();
		normal no= new normal();
	
		
		
	}
	}
		
	
