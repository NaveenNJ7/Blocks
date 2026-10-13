package Theory;

public class Mix {

	// check both examples properly
	/*static
	{
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		
		System.out.println(3);
		Mix m = new Mix();
	}
	
	{
		System.out.println(2);
	} */
	
	
	
	static
	{
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		
		Mix m = new Mix();
		System.out.println(3);
	}
	
	{
		System.out.println(2);
	}
}
