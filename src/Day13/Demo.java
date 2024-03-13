package Day13;

class company
{
	String cn="w3 softech";
	int ac = 100002588;
	void display() {
		System.out.println("Salary credited by:"+cn);
		System.out.println("From account number :"+ac);
	}
}
class emp1 extends company
{
	String emp1="Harideep";
	int sal1=18360;
	int ac1= 258712478;
	void show() {
		System.out.println("To account number :"+ac1);
		System.out.println("Employee name:"+emp1);
		System.out.println("Credited salary:"+sal1);
		
	}
}
class emp2 extends  company//emp1
{
	String emp2="Hemanth";
	int sal2=183605;
	int ac2= 258712744;
	void print()
	{
		System.out.println("To account number :"+ac2);
		System.out.println("Employee name:"+emp2);
		System.out.println("Credited salary:"+sal2);
		
	}
	
}
class emp3 extends  company
{
	String emp3="Vaishnavi";
	int sal3=18360;
	int ac3= 258714569;
	void emploee()
	{
		System.out.println("To account number :"+ac3);
		System.out.println("Employee name:"+emp3);
		System.out.println("Credited salary:"+sal3);
		
	}
	
}

public class Demo{ //extends emp2 {

	public static void main(String[] args) {
		emp1 res =new emp1();
		res.display();
		res.show();
		emp2 res1 = new emp2();
		res1.display();
		res1.print();
		emp3 res2 = new emp3();
		res2.display();
		res2.emploee();
	
		//Demo de = new Demo();
		//de.display();
		//de.show();
		//de.print();
	
		

	}

}
