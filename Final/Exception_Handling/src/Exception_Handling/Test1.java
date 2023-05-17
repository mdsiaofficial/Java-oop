
package Exception_Handling;


public class Test1  
{ 
	public static void main(String[] args) 
	{ 
		try
		{ 
			System.out.println("1"); 
			int sum = 9 / 0; 
			System.out.println("2"); 
		} 
		catch(ArithmeticException e) 
		{ 
			System.out.println("3"); 
		} 
		finally
		{ 
			System.out.println("5"); 
		} 
	} 
} 

