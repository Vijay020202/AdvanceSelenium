package loops;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter value for a:");
		int a=sc.nextInt();
		
		System.out.print("enter value for b:");
		int b=sc.nextInt();
		
		if (a>b) {
			System.out.println("Greatest value is:"+a);
		}

		else {
			System.out.println("Greatest value is:"+b);
		}
	}

}
