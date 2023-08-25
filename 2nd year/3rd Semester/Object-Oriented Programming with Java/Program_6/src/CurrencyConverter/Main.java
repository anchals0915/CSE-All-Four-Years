package CurrencyConverter;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Currency c = new Currency();
		Distance d = new Distance();
		Time t = new Time();
		int choice;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("\n\n1.INR to Dollars\n2.INR to Euro\n3.INR to Yen\n4.Dollars to INR\n5.Euro to INT\n6.Yen to INR");
			System.out.println("7.hr to min\n8.min to hr\n9.hr to sec\n10.sec to hr");
			System.out.println("11.km to meters\n12.meters to km\n13.km to miles \n14.miles to km");
			System.out.println("Enter you choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1: c.inr_dollar();
					break;
				case 2: c.inr_euro();
					break;
				case 3: c.inr_yen();
					break;
				case 4: c.dollars_inr();
					break;
				case 5: c.euro_inr();
					break;
				case 6: c.yen_inr();
					break;
				case 7: t.hr_min();
					break;
				case 8: t.min_hr();
					break;
				case 9: t.hr_sec();
					break;
				case 10: t.sec_hr();
					break;
				case 11: d.km_meter();
					break;
				case 12: d.miles_km();
					break;
				case 13: d.km_miles();
					break;
				case 14: d.miles_km();
					break;
			}
		}while(choice!=0);
	}
}
