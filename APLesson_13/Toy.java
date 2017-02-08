public abstract class Toy
{
	public String name;
	public int count;
	
	public Toy()
	{
		name = "";
		count = 1;
	}	
	public Toy(String name)
	{
		this.name = name;
		count = 1;
	}	
	public String getName()
	{
		return name;
	}	
	public int getCount()
	{
		return count;
	}
	public void setName(String name)
	{
		this.name = name;
	}	
	public void setCount(int count)
	{
		this.count = count;
	}
	public abstract String getType();
	public String toString()
	{
		return name + " " + count;
	}
}