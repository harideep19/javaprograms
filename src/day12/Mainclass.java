package day12;

public class Mainclass {

	public static void main(String[] args) 
	{
		Encapslation en = new Encapslation();{
			en.setAccno(1000);
			en.setName("Harideep");
			en.setD(10.5);
			en.getName();
			System.out.println(en.getAccno());
			System.out.println(en.getName());
			System.out.println(en.getD());
		}
	}

}
