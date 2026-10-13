package Theory;

public class Pen {

	
/*	static int x =10;
	
	static
	{
		x = 20;
		System.out.println("Static block value :"+x);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method will execute after static");
		Pen p = new Pen();
		System.out.println("Non static value :"+x+" it will execute only after object creation");
	}
	
	{
		x =30;
	}  */

 // initialy x loaded - 10 - 20 - 30 
	
	
  static int y =10;
	
	static
	{
		y = 20;
	}
	
	public static void main(String[] args) {
		
		System.out.println(y); //20
		Pen p = new Pen();
		
		System.out.println(y); //30
	}
	
		{
		y =30;
	    } 
	
}
// x - 10 - 20
