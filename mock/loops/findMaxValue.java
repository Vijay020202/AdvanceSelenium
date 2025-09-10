package loops;

public class findMaxValue {

	public static void main(String[] args) {
		
		int[] a= {5,1,3,4,2};
		
		int max=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(max<a[i]) {
			max=a[i];
		}
			
		}

		System.out.println(max);
	}

}
