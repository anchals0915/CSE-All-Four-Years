package Lab;

import java.util.Scanner;

public class Staff 
{
	String staffId ;
	String name;
	long phone;
	long salary;
	
	Scanner sc = new Scanner (System.in);

	void read()
	{
		System.out.print("Enter StaffId : ");
		staffId = sc.next() ;
		System.out.print("Enter Name : ");
		name = sc.next();
		System.out.print("Enter Phone : ");
		phone = sc.nextLong();
		System.out.print("Enter Salary : ");
		salary = sc.nextLong();
	}
	void display() 
	{
		System.out.println("StaffId : "+staffId +"\tName : "+ name +"\nPhone : "+ phone +"\nSalary : " + salary );
	}
}