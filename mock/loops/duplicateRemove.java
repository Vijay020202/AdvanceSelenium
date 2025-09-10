package loops;

import java.util.HashSet;
import java.util.Set;

public class duplicateRemove {

	public static void main(String[] args) {
		
		String sr="ddrddyggkkytc";
		 
		 Set s=new HashSet<>();
		 
		for (int i  = 0; i < sr.length(); i++) {
			s.add(sr.charAt(i));
		}
		System.out.println(s);
	}

}
