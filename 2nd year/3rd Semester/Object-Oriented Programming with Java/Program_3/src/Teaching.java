package Lab;

import java.util.Scanner;

public class Teaching extends Staff 
{
	String domain;
	int publication;
	
	Scanner sc = new Scanner (System.in);
	
	void read()
	{
		super.read();
		
		System.out.print("Enter Domain : ");
		domain = sc.next() ;
		System.out.print("Enter Publication : ");
		publication = sc.nextInt() ;
	}
	void display() 
	{
		System.out.println("\tTeaching Staff ");
		super.display();
		System.out.println("Domain : "+domain+"\tPublication : "+ publication);
	}
}