package Lab;

public class Cube implements Runnable
{
	int x;
	Cube(int x)
	{
		this.x = x;
	}
	@Override
	public void run() {
		int cube = x*x*x;
		System.out.println("Cube of "+x+" = "+cube);
	}
}
