,m package loops;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {

	public static void main(String[] args) {
		
		int arr[]= {1,1,2,2,3,3,4,4};
		
		Set s=new HashSet();
		
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}
        System.out.println(s);
	}

}
