package day12;

public class Encapslation {
	private int accno;
	private String name;
	private	double d;

	
	
	



	public int getAccno() {
		return accno;
	}







	public void setAccno(int accno) {
		this.accno = accno;
	}







	public String getName() {
		return name;
	}







	public void setName(String name) {
		this.name = name;
	}







	public double getD() {
		return d;
	}







	public void setD(double d) {
		this.d = d;
	}







	public static void main(String[] args) {
		
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
