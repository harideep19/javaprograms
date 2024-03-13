package day12;

public class This_key_word {
int x,y;
double d;

 void setdata(int x,int y) {
	this.x=x; // this key word is is used to represent the class variables // to avoid the confussion
	this.y=y;
 }
	 void display() {
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(x+y);
	 }
 
	public static void main(String[] args) {
		This_key_word kw= new This_key_word();
			
			kw.setdata(25, 30);
		
			kw.display();
			
			
		

	}

}
