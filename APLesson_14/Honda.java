import java.util.Random;

public class Honda implements Location
{
	private double[] location;
	
	public Honda(double[] location)
	{
		this.location = location;
	}
	
	public int getID()
	{
		Random rng = new Random();
		return 100000+rng.nextInt(900000);
	}
	
	public void move(int x, int y)
	{
		location[1] = x;
		location[2] = y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}