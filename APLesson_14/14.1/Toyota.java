import java.util.Random;

public class Toyota extends Car
{
	public Toyota(String coords)
	{
		super();
		double[] loc = new double[2];
		String[] c = coords.split(", ");
		loc[0] = Double.parseDouble(c[0]);
		loc[1] = Double.parseDouble(c[1]);
		
		this.location = loc;
	}
}