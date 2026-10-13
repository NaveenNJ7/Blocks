package Theory;

public class Non {
	
	{
		System.out.println("Block-1");
	}
	
	{
		System.out.println("Block-3");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Blocks will get executed in sequentital manner");
		
		Non n = new Non(); 
		//just if we create object,then whatever print in blocks will get executed
	}
    
	{
		System.out.println("Block-2");
	}
}
