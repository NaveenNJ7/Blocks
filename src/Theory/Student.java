package Theory;

public class Student {

	
	static String name;
	static int age;
	
	static
	{
		name = "Karna";
		age = 15;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Student details"+"\n"+"Name :"+name+"\nAge :"+age);
	}
}
