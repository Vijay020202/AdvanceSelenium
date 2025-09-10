package loops;

import java.util.Arrays;

public class maxValueWithSort {

	public static void main(String[] args) {
		
		int[] a= {5,1,2,3,4,2};

		Arrays.sort(a);
		
		System.out.println(a[a.length-1]);
	}

}
