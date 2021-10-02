
public class BuyStock implements State{

	FlySwatter fly;
	public BuyStock(FlySwatter fly)
	{
		this.fly=fly;
	}
	
	public void hasStock() 
	{
		System.out.println("FlySwatters are not  in Stock");
	}
	
	public void sellStock() 
	{
		System.out.println("FlySwatters are already sold out ");
		
	}
	
	
	public void buyStock() 
	{
		System.out.println("Need to buy the stock...   Buting... ");
	}
	
	public String toString() 
	{
		return "=== Buying === ";
	}
}
