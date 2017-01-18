public class Car
{
	private String p, i, e, t;
	
	public Car(String px, String ix, String ex, String tx)
	{
		p = px;
		i = ix;
		e = ex;
		t = tx;
	}
	
	public void setValues(String px, String ix, String ex, String tx)
	{
		p = px;
		i = ix;
		e = ex;
		t = tx;
	}
	
	public String getPaint()
	{
		return p;
	}
	
	public String getInterior()
	{
		return i;
	}
	
	public String getEngine()
	{
		return e;
	}
	
	public String getTires()
	{
		return t;
	}
}