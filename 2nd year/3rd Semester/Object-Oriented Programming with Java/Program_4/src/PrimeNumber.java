package Lab;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n= sc.nextInt();
		for(int i=2 ; i*i<=n ; i++) 
		{
			if(n%i==0)	
			{
				System.out.print("Not a Prime Number ");
				System.exit(0);
			}
		}
		System.out.print("Prime Number ");
	}

}
