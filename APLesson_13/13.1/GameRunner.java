public class GameRunner
{
	public static void main(String args[])
	{
		PlayStation ps4 = new PlayStation("Kyle's PS4");
		System.out.println(ps4);
		
		PC asus = new PC("Kyle's Laptop");
		System.out.println(asus);
		
		XBox xbone = new XBox("Garbage System");
		System.out.println(xbone);
	}
}