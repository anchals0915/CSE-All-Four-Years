package CurrencyConverter;

import java.util.Scanner;

public class Currency {
	public void inr_dollar() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Amount in Rupees : ");
		int rupees = sc.nextInt();
		float dollars = rupees/80;
		System.out.print("Amount in Dollars : "+dollars);
	}
	
	public void inr_euro() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Amount in Rupees : ");
		int rupees = sc.nextInt();
		float euro = rupees/87;
		System.out.print("Amount in Euro : "+euro);
	}
	
	public void inr_yen() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Amount in Rupees : ");
		int rupees = sc.nextInt();
		float yen = rupees/0.6f;
		System.out.print("Amount in Yen : "+yen);
	}
	public void dollars_inr() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Amount in Dollars : ");
		int dollars = sc.nextInt();
		float rupees = dollars*80;
		System.out.print("Amount in rupees : "+rupees);
	}
	public void euro_inr() {

		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Amount in Euro : ");
		int euro = sc.nextInt();
		float rupees = euro*87;
		System.out.print("Amount in rupees : "+rupees);
	}
	public void yen_inr() {

		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Amount in Yen : ");
		int yen = sc.nextInt();
		float rupees = yen*0.6f;
		System.out.print("Amount in rupees : "+rupees);
	}
}
