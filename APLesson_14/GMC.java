import java.util.Random;

public class GMC implements Location
{
	private int x;
	private int y;
	
	public GMC(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getID()
	{
		Random rng = new Random();
		return 100000+rng.nextInt(900000);
	}
	
	public void move(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}
}