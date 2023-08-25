package CurrencyConverter;

import java.util.Scanner;

public class Distance {
	public void km_meter() {

		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Distance in km : ");
		int km = sc.nextInt();
		float meter = km*1000;
		System.out.print("Distance in meter : "+meter);
	}
	public void meter_kn() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Distance in meters : ");
		int meter = sc.nextInt();
		float km = meter/1000;
		System.out.print("Distance in km : "+km);
	}
	public void km_miles() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Distance in km : ");
		int km = sc.nextInt();
		float miles = km/1.6f;
		System.out.print("Distance in miles : "+miles);
	}
	public void miles_km() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Distance in miles : ");
		int miles = sc.nextInt();
		float km = miles*1.6f;
		System.out.print("Distance in km : "+km);
		
	}
}
