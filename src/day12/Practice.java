package day12;

public class Practice {
	
	private int a=10;
	private int b=20;
	private String str="Hardeep";
	
	
	

	public int getA() {
		return a;
	}




	public void setA(int a) {
		this.a = a;
	}




	public int getB() {
		return b;
	}




	public void setB(int b) {
		this.b = b;
	}




	public String getStr() {
		return str;
	}




	public void setStr(String str) {
		this.str = str;
	}




	public static void main(String[] args) {
		
		Practice res = new Practice();
		res.setA(30);
		res.setB(40);
		res.setStr("mani");
		System.out.println(res.getA());
		System.out.println(res.getB());
		System.out.println(res.getStr());
		
		//static
		
		
		
		
		
		
		
	}

}
