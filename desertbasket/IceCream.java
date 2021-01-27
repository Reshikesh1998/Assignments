package desertbasket;

public class IceCream extends DessertItem {
	final int cost = 20; 
	int quantity;
	public IceCream(String name, int quantity) {
		super(name);
		this.quantity =  quantity;
		
	}
	@Override
	int CostCalcultor() {
		
		return (this.cost * quantity);
	}
	
	IceCream()
	{
		
	}

}
