
public class HasStock implements State{
	
	FlySwatter fly;
	public HasStock(FlySwatter fly)
	{
		this.fly=fly;
	}
	
	public void hasStock() 
	{
		System.out.println("FlySwatters are in Stock");
	}
	
	public void sellStock() 
	{
		System.out.println("FlySwatters are not selling yet ... ");
		
	}
	
	
	public void buyStock() 
	{
		System.out.println("Inventory is full ");
	}
	
	public String toString() 
	{
		return "=== Has Stock === ";
	}
}
