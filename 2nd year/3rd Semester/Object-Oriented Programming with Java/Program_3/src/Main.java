package Lab;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of Teaching Staff : ");
		int n_teach = sc.nextInt();
		Teaching[] teach = new Teaching[n_teach];
		for(int i=0;i<n_teach ;i++)
		{
			teach[i] =new Teaching();
			teach[i].read();
		}
		for(int i=0;i<n_teach ;i++)
		{
			teach[i].display();
		}
		
		
		System.out.print("\nEnter no. of Technical Staff : ");
		int n_tech = sc.nextInt();
		Technical[] tech = new Technical[n_tech];
		for(int i=0;i<n_tech ;i++)
		{
			tech[i] = new Technical();
			tech[i].read();
		}
		for(int i=0; i<n_tech ;i++)
		{
			tech[i].display();
		}
		
		
		
		System.out.print("\nEnter no. of Contract Staff : ");
		int n_cont = sc.nextInt();
		Contract[] cont = new Contract[n_cont];
		for(int i=0;i<n_cont;i++)
		{
			cont[i] = new Contract();
			cont[i].read();
		}
		for(int i=0 ;i<n_cont ;i++)
		{
			cont[i].display();
		}
		
	}
}
