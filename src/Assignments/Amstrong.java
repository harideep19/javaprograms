package Assignments;

public class Amstrong {

	public static void main(String[] args) {
		int num=1000;
		int rem;
		int res=0;
		int temp;
		temp=num;
		while(num>0) 
		{
			rem=num%10;
			rem=(int) Math.pow(rem, 3);
			res=res+rem;
			num=num/10;
		}
		if(temp==res) {
			System.out.println("number is amstrong");
		}else {
			System.out.println("not amstrong");
		}
	}

}
