package Theory;

public class Statics {

	static String N = "static blocks";
	static
	{
		System.out.println("Block no-1");
	}
	
	public static void main(String[] args) {
		
		System.out.println("If class is having "+N+"\nalways blocks will execute first even before main method");
		System.out.println("They will execute in sequential order");
	}
	
	static
	{
		System.out.println("Block no-3");
	}
	
	static
	{
		System.out.println("Block no-2");
	}
	
	
	
}
