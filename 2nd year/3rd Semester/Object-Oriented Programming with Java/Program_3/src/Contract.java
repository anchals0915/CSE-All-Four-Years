package Lab;

import java.util.Scanner;

public class Contract extends Staff 
{
	int period ;
	Scanner sc = new Scanner (System.in);
	
	void read()
	{
		super.read();
		System.out.print("Enter Period : ");
		period = sc.nextInt() ;
	}
	void display() {
		System.out.println("\tContract Skills");
		super.display();
		System.out.println("Period : "+ period);
	}
}