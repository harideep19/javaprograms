package Day13;
class D
{
	int d=20;
	void didplay()
	{
		System.out.println(d);
	}
}
class E extends D
{
	int e=40;
	void show()
	{
		System.out.println(e);
	}
}	
class F extends E
{
	int f =50;
	void print()
	{
		System.out.println(f);
	}
}

public class Multi {

	public static void main(String[] args) {
		F s= new F();
		s.didplay();
		s.show();
		s.print();
		
	}

}
