import java.util.Random;

public class Toyota implements Location
{
	private double[] location;
	
	public Toyota(String coords)
	{
		double[] loc = new double[2];
		String[] c = coords.split(", ");
		loc[0] = Double.parseDouble(c[0]);
		loc[1] = Double.parseDouble(c[1]);
		
		this.location = loc;
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