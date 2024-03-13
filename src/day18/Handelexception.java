package day18;

public class Handelexception {

	public static void main(String[] args) {
System.out.println("program started");
String s= "null";
try {
	System.out.println(s.length());
	
}
catch(ArithmeticException e)
{
	System.out.println("invalid data");
}
catch(NullPointerException e)
{
	System.out.println();
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("invalid data");
}
	finally {
		System.out.println("entered into final block");
		
	}
}
	}


