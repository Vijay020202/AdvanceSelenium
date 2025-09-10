package loops;

public class dowhile {

	public static void main(String[] args) {
		
		int a=1;
		int sum=0;
		
		do{
			
			sum=sum+a;
			a++;
		}
		
		while(a<=10);
		
		System.out.println("sum of 10 numbers:"+sum);

	}
}

