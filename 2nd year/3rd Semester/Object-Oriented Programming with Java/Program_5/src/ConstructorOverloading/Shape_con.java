package Lab;

import java.util.Scanner;

public class Shape_con 
{
	float ar;
	Shape_con(int side)
	{
		ar = side*side;
	}
	Shape_con(int length,int breadth)
	{
		ar = length*breadth;
	}
	Shape_con(int a, int b, int c)
	{
		float s =(a+b+c)/2f;
		ar = (float)( Math.sqrt(s* (s-a)*(s-b)* (s-c) ) );
	}
	Shape_con(float radius)
	{
		ar = (float)(Math.PI * radius *radius);
	}
}

class Shape_conDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Shape_con squ = new Shape_con(3);
		System.out.println("Area of Square : "+ squ.ar);
		
		Shape_con rec = new Shape_con(2,3);
		System.out.println("Area of Rectangle : "+ rec.ar);
		
		Shape_con tri = new Shape_con(2,3,4);
		System.out.println("Area of Triangle : "+ tri.ar);
		
		
		Shape_con cir = new Shape_con(2);
		System.out.println("Area of Circle : "+ cir.ar);
		
	}
}