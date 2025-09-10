package loops;

public class converUpperCaseIntoLower {

	public static void main(String[] args) {
		

		String s="ABC";
		
		String s1="";
		
		for(int i=0;i<s.length();i++) {
			
			s1=s1+(char)(s.charAt(i)+32);
		}
         System.out.println(s1);

	}

}
