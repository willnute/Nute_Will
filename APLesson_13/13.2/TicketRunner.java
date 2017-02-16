public class TicketRunner
{
	public static void main(String args[])
	{
		Ticket advance = new Advance(5);
		Ticket stadv = new StudentAdvance(16);
		Ticket walk = new Walkup();
		
		System.out.println(advance);
		System.out.println(stadv);
		System.out.println(walk);
	}
}