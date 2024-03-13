package Day13;


class c1 {
	int a=10;
	int b=20;
	void display() {
		System.out.println(a+b);
	}
}
	class c2  extends c1{
		int c=20;
		int d=30;
		void show() {
			System.out.println(c-d);
		
	}
}
	class c3 extends c2 { // extends c1 hierarcy
		int e=55;
		int f=44;
		void snow() {
			System.out.println(f-e);
		}
	}

public class Practice extends c3 {
	

	public static void main(String[] args) {
		Practice res = new Practice();
		res.
		

	}

}
