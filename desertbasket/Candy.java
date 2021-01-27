package desertbasket;

public class Candy extends DessertItem{
	
	int weight;
	final int costperkg = 50;
	
	

	public Candy(String name, int weight) {
		super(name);
		this.weight = weight;
	}

	public Candy(String name) {
		super(name);
		
	}

	@Override
	int CostCalcultor() {
		int totalcost;
		totalcost = (int)(5* (float)(weight/100));
		return totalcost;
	}
	
	

}
