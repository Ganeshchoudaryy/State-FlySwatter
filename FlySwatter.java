
public class FlySwatter {
	
	State hasstock;
	State buystock;
	State sellingstock;
	
	State state;
	int count = 0;
	public FlySwatter (int numberofflyswatters)
	{
		hasstock= new HasStock(this);
		buystock= new BuyStock(this);
		sellingstock = new SellingStock(this);
		
		this.count = numberofflyswatters;
		if(numberofflyswatters > 0)
		{
			state = hasstock;
		}
		else
		{
			state = buystock;
		}
	}
	
	public void hasStock()
	{
		state.hasStock();
	}
	
	public void sellStock()
	{
		state.sellStock();
	}
	
	public void flysold()
	{
		System.out.println("FlySwatter is Sold");
		if(count>0)
		{
			count = count - 1;
		}
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void buyStock(int count)
	{
		this.count += count;
		System.out.println("Total more stock added = "+ this.count);
		state.buyStock();
	}
	
	
	void setState(State state) 
	{
		this.state = state;
	}
	public State getState() 
	{
        return state;
    }

    public State getHasStock() 
    {
        return hasstock;
    }

    public State getSellStock() 
    {
        return sellingstock;
    }
    public State getBuyStock() 
    {
        return buystock;
    }
    
    
    public String toString() 
    {
		StringBuffer result = new StringBuffer();
		result.append("\nElectrical Fly Swatter Shop");
		result.append("\nJava-enabled FlySwatter");
		result.append("\nShop has " + count + " FlySwatter");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("FlySwatter is in " + state + "\n");
		return result.toString();
	}
	

}
