package loops;

import java.util.Scanner;
public class ifelseladder {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter value for a:");
		int a=sc.nextInt();
		
		System.out.print("Enter value for b:");
		int b=sc.nextInt();
		
		System.out.print("Enter value for c:");
		int c=sc.nextInt();
		
		
		if(a>b && a>c) {
			
			System.out.println("Greatest number is:"+a);
		}
        if(b>a && b>c) {
			
			System.out.println("Greatest number is:"+b);
		}
		
		else if (c>a && c>b){
			System.out.println("Greatest number is:"+c);
		}
		

	}

}
