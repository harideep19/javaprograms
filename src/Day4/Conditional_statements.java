package Day4;

public class Conditional_statements {

	public static void main(String[] args) {
		int age=51;
		if (age<15) {
			System.out.println("Can goto school");
		}
		else if (age<=22) {
			System.out.println("Can goto collage");
		}
		else if(age<=23) {
			System.out.println("can goto office");
		}
		else if (age<=27) {
			System.out.println("can get married");
		}
		else if(age<=50) {
			System.out.println("Can retire");
		}
		else {
			System.out.println("Invalid");
	}
//		int a=100,b=200,c=300;
//		if(a>b&&b>a) {
//			System.out.println("grater number is a :"+a);
//		}
//		else if (b>a&&b>c) {
//			System.out.println("grater number is b :"+b);
//		}
//		else {
//			System.out.println("grater number is c : "+c);
//		}

}
}
