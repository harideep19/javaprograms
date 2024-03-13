package Assignments;

public class CountString {

	public static void main(String[] args) {
		String str="Harideep";
		int len=str.length();
	    int	count =0;
	    
	    for(int i=0;i<=len-1;i++) {
	    	count=count+str.charAt(i);
	    	count++;
	    }
	    System.out.println(count);

	}

}
