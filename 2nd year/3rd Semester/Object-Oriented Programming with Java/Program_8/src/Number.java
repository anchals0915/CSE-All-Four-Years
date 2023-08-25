package Lab;

import java.util.Random;

public class Number extends Thread
{
	public void run()
	{
		Random rand = new Random();
		for(int i =0 ;i<5 ;i++)
		{
			int randomnumber = rand.nextInt(100);
			System.out.println("Random generated is : "+ randomnumber);
			
			Square squ = new Square(randomnumber);
			Thread t1 = new Thread(squ);
			t1.start();
			
			Cube cub = new Cube(randomnumber);
			Thread t2 = new Thread(cub);
			t2.start();
			
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}