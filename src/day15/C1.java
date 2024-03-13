package day15;
class C2
{
	int z=30;
	void main()
	{
		System.out.println(z);
	}
}
//public class C1  implements I1,I2{ // multiple inheretence 
	public class C1 extends C2 implements I1,I2{ // Hybrid inheretence 
	public void m1() {
		System.out.println(x);
	}
	public void m2() {
		System.out.println(y);
		
		
	}
	public static void main(String[] args) {
		C1 res= new C1();
		res.m1();
		res.m2();
		System.out.println( res.z);
		
		
}
}