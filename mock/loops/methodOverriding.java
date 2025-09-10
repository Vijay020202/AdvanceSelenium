package loops;



public class methodOverriding {

	public void sheela() {
		System.out.println("sheela from super-class.!");
		
	}
	
}
class methodOverriding2 extends methodOverriding{
	
	public void sheela() {
		System.out.println("sheela from sub-class.!");
		
	}
}
class driver{
	
	public static void main(String[] args) {
		
		methodOverriding ref=new methodOverriding2();
		
		ref.sheela();
	}
	

}
