
public class SellingStock implements State{
	
	FlySwatter fly;
	public SellingStock(FlySwatter fly)
	{
		this.fly=fly;
	}
	
	public void hasStock() 
	{
		System.out.println("FlySwatters are in Stock");
	}
	
	public void sellStock() 
	{
		System.out.println("FlySwatters are selling rapidly ... ");
		fly.flysold();
	}
	
	
	public void buyStock() 
	{
		System.out.println("FlySwatters are still in inventory ");
	}
	
	public String toString() 
	{
		return "=== Selling === ";
	}

}
