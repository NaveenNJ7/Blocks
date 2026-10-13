package Theory;

public class Nonstatics {

	String name;
	int age;
	
	{
	  System.out.println("Student Details");
	  name="Kumar";
	}
	
	public static void main(String[] args) {
		
		Nonstatics n = new Nonstatics();
		System.out.println("Students-1");
		System.out.println("Name : "+n.name+"\n"+"Age : "+n.age);
	}
	
	{
		age = 14;
	}
	
}
