package Lab;

public class Square implements Runnable 
{
	int x;
	Square(int x)
	{
		this.x = x;
	}
	@Override
	public void run() {
		int squ = x*x;
		System.out.println("Square of " + x+ " = "+squ);
	}
}