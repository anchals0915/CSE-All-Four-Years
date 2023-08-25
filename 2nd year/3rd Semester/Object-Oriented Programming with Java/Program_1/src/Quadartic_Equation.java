package Lab;

import java.util.Scanner;

/*
 * Aim : Introduce the java fundamentals, data types ,operators in java 
 * Program : Write a java program that prints all the real solutions to the quadratic Equation 
 * ax^2+bx+c=0 . REad in a,b,c and use the quadratic formula.
 */
public class Quadartic_Equation 
{
	public static void main(String[] args)	
	{
		Scanner sc = new Scanner(System.in);
		float root1 = 0f , root2 = 0f;
		
		System.out.print("Enter the values of a,b,c in ax^2+bx+c=0   : ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		if(a==0) 
		{
			System.out.println("It is not a Quadratic Equation");
			System.exit(0);
		}
		else	
		{
			float d =   b*b - 4*a*c;
			if(d==0)	
			{
				//Roots are real and equal
				System.out.println("Roots are real and equal .");
				root1 = root2 =  (-b)/(2*a) ; 
				System.out.println("Roots are " + root1 + " and "+ root2);
				
			}
			else if(d>0)	{
				//Roots are real and distinct 
				System.out.println("Roots are real and distinct .");
				root1 = (-b + (float) Math.sqrt(d)/(2*a));
				root2 = (-b - (float) Math.sqrt(d)/(2*a)) ; 
				System.out.println("Roots are " + root1 + " and "+ root2);
				
			}
			else 	//d<0
			{
				//roots are imaginary 
				System.out.println("Roots are imaginary .");
				root1 = (-b)/(2*a);
				root2 = ((float) Math.sqrt( b*b - 4*a*c)) / (2*a) ;

				System.out.println("Root is " + root1 + " + i "+ root2);
				System.out.println("Root is " + root1 + " - i "+ root2);
			}
 		}
		
		sc.close();
	}
}

