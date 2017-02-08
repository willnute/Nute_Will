import java.util.Arrays;
import java.util.ArrayList;

public class ToyStore
{
	public ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<>();
	}
	
	public ToyStore(String i)
	{
		toyList = loadToys(i);
	}
	
	public ArrayList<Toy> loadToys(String ts)
	{
		toyList = new ArrayList<>();
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy newToy = getThatToy(name);
			if(newToy==null)
			{
				if(type.equals("Car"))
					toyList.add(new Car(name));
				if(type.equals("AF"))
					toyList.add(new AFigure(name));
			}
			else
				newToy.setCount(newToy.getCount()+1);
		}
		return toyList;
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy t : toyList)
		{
			if(t.getName().equals(nm))
				return t;
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name="";
		int max = Integer.MIN_VALUE;
		for(Toy t : toyList)
		{
			if(max<t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy t : toyList)
		{
			if(t.getType().equals("Car"))
				cars++;
			if(t.getType().equals("Action Figure"))
				figures++;
		}
		if(cars>figures)
			return "Cars";
		if(figures>cars)
			return "Action Figures";
		return "Equal amount of action figures and cars!";
	}
	
	public String toString()
	{
		return ""+toyList;
	}
}