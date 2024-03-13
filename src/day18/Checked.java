package day18;

public class Checked {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {						//surround with try/catch
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		Thread.sleep(5000);               //add throws decleretion
		System.out.println(4);
		System.out.println(5);
		Thread.sleep(3000);
		System.out.println(6);

	}

}
