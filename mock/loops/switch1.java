package loops;

import java.util.Scanner;
public class switch1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter alphabet");
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		
		case 'a':
			System.out.println("Vowel");
			
		case 'e':
			System.out.println("Vowel");
			
		case 'i':
			System.out.println("Vowel");
			
		case 'o':
			System.out.println("Vowel");
			
		case 'u':
			System.out.println("Vowel");
		
			break;
		default: 
		{
			System.out.println("It is a consonent..!");
		}
		}
		
			}

}
