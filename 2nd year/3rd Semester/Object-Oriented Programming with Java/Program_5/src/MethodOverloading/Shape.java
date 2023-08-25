package Lab;

import java.util.*;

public class Shape 
{
	int side;
	int len,bre;
	float a,b,c;
	float r;
	//square
	public float area(int side) {
		return side*side;
	}
	//rectangle
	public float area(int length,int  breadth) {
		return length*breadth;
	}
	//triangle
	public float area(float a,float b, float c ) {
		float s =(a+b+c)/2f;
		return (float)( Math.sqrt(s* (s-a)*(s-b)* (s-c) ) );
	}
	//circle
	public float area(float radius) {
		return (float)(Math.PI * radius *radius);
	}
}
class ShapeDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Shape s = new Shape();
		System.out.print("Enter side of Square  : ");
		s.side = sc.nextInt();
		System.out.println("Area : "+   s.area(s.side)  );
		
		
		System.out.print("\nEnter the sides of the Rectangle : ");
		s.len = sc.nextInt();
		s.bre = sc.nextInt();
		System.out.println("Area : "+   s.area(s.len ,s.bre )  );
		
		System.out.print("\nEnter the sides of triangle : ");
		s.a = sc.nextFloat();
		s.b = sc.nextFloat();
		s.c = sc.nextFloat();
		System.out.println("Area : "+   s.area(s.a,s.b,s.c)  );
		
		System.out.print("\nEnter the radius of Circle : ");
		s.r = sc.nextFloat();
		System.out.println("Area : "+   s.area(s.r)  );
	}
}