package desertbasket;

public class Sundae extends IceCream{
	final int costpertopping = 5; 
	int numberoftoppings = 0;
	
	int cost = 0;;
	
	
	
	
public Sundae() {
		
		
		this.numberoftoppings = 0;
		this.quantity =0;
		
		
	}

	public Sundae(String name,int numberoftoppings) {
		
		this.numberoftoppings = numberoftoppings;
		this.cost = 20;
		 
		
		
	}
@Override
int CostCalcultor() {
	// TODO Auto-generated method stub
	int total = this.cost + (this.costpertopping * this.numberoftoppings);
	return total;
}
	

}
