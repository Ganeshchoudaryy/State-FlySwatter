
public class TestProgram {
	
	
	public static void main(String[] args) 
	{
		FlySwatter fly = new FlySwatter(15);
		 System.out.println(fly);
		 
		 fly.hasStock();
		 fly.sellStock();
		 
		 System.out.println(fly);
		 fly.buyStock(10);
		 fly.hasStock();
		 fly.sellStock();
		 System.out.println(fly);
		 
		 fly.hasStock();
		 fly.sellStock();
		 
		 System.out.println(fly);
		 

	}
	
	

}
