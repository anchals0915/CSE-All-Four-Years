package Lab;

import java.util.Scanner;

public class Technical extends Staff 
{
	String skills;
	Scanner sc = new Scanner (System.in);
	
	void read()
	{
		super.read();
		System.out.print("Enter Skills : ");
		skills = sc.nextLine() ;
	}
	void display() 
	{
		System.out.println("\tTechnical Staff");
		super.display();
		System.out.print("Skills : "+skills);
	}
	
}