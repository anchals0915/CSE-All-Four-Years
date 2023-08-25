package ExceptionHandling;

import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b :");
		int b = sc.nextInt();
		try	{
			if(b==0) 
				throw new ArithmeticException();
			
			System.out.print("a/b = "+ (a/b) );
		}
		catch(ArithmeticException e)
		{
			System.out.print( e + "b is equal");
		}
	}

}
