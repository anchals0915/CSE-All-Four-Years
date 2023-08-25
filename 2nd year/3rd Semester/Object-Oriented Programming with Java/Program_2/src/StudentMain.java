package Lab;

import java.util.Scanner;

public class StudentMain
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number of students : ");
		int n = sc.nextInt();
		Student[] stu =new Student[n];
		
		//read
		for(int i=0;i<n;i++)
		{
			stu[i] = new Student();
			
			System.out.print("Enter USN : ");
			stu[i].USN = sc.next();
			
			System.out.print("Enter Name : ");
			stu[i].name = sc.next();
			
			System.out.print("Enter Branch : ");
			stu[i].branch = sc.next();
			
			System.out.print("Enter Phone : ");
			stu[i].phone = sc.nextLong();
		}
		
		System.out.println("USN\t\tName\t\tBranch\t\tPhone");
		
		//display
		for(int i=0;i<n;i++)
		{
			stu[i].display();
		}
		
		sc.close();
	}
}