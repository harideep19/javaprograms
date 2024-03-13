package Day13;


class A
{
	String str1="Hari";
	String str2="Deep";

void display()
{
	System.out.println(str1+str2);
}
}
class B extends A
{
	int b=100;
	
	void show()
	{
		System.out.println(b);
	}
}
public class Single_inheretience {

	public static void main(String[] args) {
		 B s=new B();
		 s.display();
		 s.show();

	}

}
