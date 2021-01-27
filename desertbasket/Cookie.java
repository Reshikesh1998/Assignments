package desertbasket;

public class Cookie extends DessertItem{
	final int costperdozen = 10; 
	int quantity = 0;
	public Cookie(String name, int quantity) {
		super(name);
		this.quantity = quantity;
		
		
	}
	@Override
	int CostCalcultor() {
		
		double totalcost;
		
		totalcost = 1.2 * this.quantity; 
		return (int) totalcost;
	}

}
