public class Lab_02
{
	public static void main(String[]args)
	{
		int factor1 = 514;
		int factor2 = 54;
		
		int product = factor1 * factor2;
		
		System.out.println(factor1 + " multiplied by " + factor2 + " equals " + product);
		
		String name = "John Doe";
		String address = "86 Road Street";
		String city = "Townsville, CA";
		String zip = "75309";
		
		System.out.println(name + "\n" + address + "\n" + city + " " + zip);
		
		int length = 6;
		int height = 7;
		int width = 8;
		
		int surface_area = 2*length*width + 2*width*height + 2*length*height;
		
		System.out.print("The surface area of your rectangular prism is " + surface_area);
	}
}