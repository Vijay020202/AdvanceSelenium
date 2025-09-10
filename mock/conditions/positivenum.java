package conditions;

import java.util.Scanner;

public class positivenum {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	System.out.println("enter value");
	int a=sc.nextInt();
	if(a<0) {
		System.out.println("its negative");
	}
	else {
		System.out.println("its positive");
	}

	}

}
