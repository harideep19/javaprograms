package Day4;

import java.util.Scanner;

public class Switch_case_assignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int month_num=sc.nextInt();
		//int month_number =12;
		switch(month_num) {
		case 1: System.out.println("january");break;
		case 2: System.out.println("February");break;
		case 3: System.out.println("March");break;
		case 4: System.out.println("April");break;
		case 5: System.out.println("May");break;
		case 6: System.out.println("June");break;
		case 7: System.out.println("August");break;
		case 8: System.out.println("September");break;
		case 9: System.out.println("October");break;
		case 10: System.out.println("November");break;
		case 11: System.out.println("december");break;
		default :System.out.println("Not a Month");break;
		
		}
		int state =10;
		
		switch(state) {
		case 1:System.out.println("Telanagana"); break;
		case 2: System.out.println("Andhra prdesh");break;
		case 3: System.out.println("kerala");break;
		case 4: System.out.println("karanataka");break;
		case 5: System.out.println("odissa");break;
		case 6: System.out.println("hariyana");break;
		case 7: System.out.println("bihar");break;
		case 8: System.out.println("raipur");break;
		case 9: System.out.println("maharastra");break;
		case 10: System.out.println("rajasthan");break;
		default: System.out.println("out of range");
		
		}

	}
	

}
