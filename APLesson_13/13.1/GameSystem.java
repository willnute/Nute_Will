import java.util.Random;

public class GameSystem
{
	public Random rng = new Random();
	public String platform;
	public int serialNo;
	
	public GameSystem()
	{
		platform = "";
		serialNo=rng.nextInt(1000000)+1000000*rng.nextInt(10);
	}
	
	public GameSystem(String p)
	{
		platform = p;
		serialNo=rng.nextInt(1000000)+1000000*rng.nextInt(10);
	}
	
	public String getPlatform()
	{
		return this.platform;
	}
	
	public int getSerialNo()
	{
		return this.serialNo;
	}
}