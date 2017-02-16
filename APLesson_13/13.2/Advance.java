public class Advance extends Ticket
{
	private int daysLeft;
	public Advance(int d)
	{
		super();
		daysLeft = d;
	}
	
	public int getPrice()
	{
		if(daysLeft >= 10)
			return 30;
		else
			return 40;
	}
}