package loops;

import java.util.HashSet;
import java.util.Set;

public class reverseStringWithHashset {

	public static void main(String[] args) {
		
        String s="java is programming laungage";
		
		Set s1=new HashSet();
		
		for (int i =0; i <s.length() ; i++) {
			
			s1.add(s.charAt(i));
			
		}
            System.out.println(s1);

	}

}
