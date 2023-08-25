package CurrencyConverter;

import java.util.Scanner;

public class Time {
	public void hr_min() {

		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Time in hr : ");
		int hr = sc.nextInt();
		int min = hr*60;
		System.out.print("Time in min : "+min);
	}
	public void min_hr() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Time in min : ");
		int min = sc.nextInt();
		int hr = min/60;
		System.out.print("Time in hours : "+ hr );
	}
	public void hr_sec() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Time in hr : ");
		int hr = sc.nextInt();
		int sec = hr*3600;
		System.out.print("Time in sec : "+ sec);
	}
	public void sec_hr() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Time in sec : ");
		int sec = sc.nextInt();
		int hr = sec/3600;
		System.out.print("Time in hours : "+ hr );
	}
}
