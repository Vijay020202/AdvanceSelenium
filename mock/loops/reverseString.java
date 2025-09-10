package loops;

import java.util.Iterator;

public class reverseString {

	public static void main(String[] args) {
		
		String s="java is programming laungage";
		
		String rev="";
		
		for (int i = s.length()-1; i >=0 ; i--) {
			
			rev=rev+s.charAt(i);
			
		}
            System.out.println(rev);
	}

}
