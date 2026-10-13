package Theory;

public class Staticblocks {

	/*
	   Blocks are set of instructions or block of codes used for initialization
	   
	   
	    Two types blocks
	   1) static block
	   2) non static block
	   
	   if block is named with static it is static
	   if block is not named with static then it is non static
	   
	   static
	   statics blocks are set of instructions used for initializing the static variables
	   
	   syntax
	   static
	   {
	   
	   }
	   
	   if class is having static blocks, always static blocks execute first even main method before 
	   or during class loading time
	   if there are multiple static blocks are present then blocks will execute in sequential oder
	   
	   non static blocks
	   set of instructions used to initializing static and non static variables.
	   but initializing static variables using non static blocks its not good practice
	   
	   syntax
	   {
	   
	   }
	   
	   if a class is having non static blocks, it will execute only during object creation 
	   (main method will execute first)
	   if class is having multiples  non static blocks, it will execute in sequential order
	   
	   Note -  we can not write directly print statement in class
	           only in blocks or methods we can write print statement
	 
	 */
}
