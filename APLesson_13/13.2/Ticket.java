import java.util.Random;

public abstract class Ticket
{
	public int serialNo;
	public Random rng = new Random();
	public Ticket()
	{
		serialNo = rng.nextInt(1000000)+1000000*rng.nextInt(10);
	}
	public int getSerialNo()
	{
		return serialNo;
	}
	public abstract int getPrice();
	public String toString()
	{
		return "Serial #: " + this.getSerialNo() + "\nPrice: " + this.getPrice();
	}
}