package Assignments;

public class Checked {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			System.out.println("found");
		}
		Thread.sleep(1500);
		
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		

	}

}
