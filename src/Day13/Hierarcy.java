package Day13;

class parent 
{      int a,b;
	void display(int c,int d)
	{
	a=c;
	b=d;
		
		System.out.println(a+b);
	}
}
class child1 extends parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}
class child2 extends parent
{
	void print (int c)
	{
		System.out.println(c);
	}
}
public class Hierarcy {

	public static void main(String[] args) {
		child1 ch= new child1();
		ch.display(20, 30);
		ch.show(20);
		//child2 ch2 = new child2();
		//ch2.display(30);
		//ch2.print(10);
		
		
		
		
	}

}
