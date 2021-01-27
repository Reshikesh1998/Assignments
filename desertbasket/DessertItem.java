package desertbasket;

public abstract class DessertItem {

	String name;

	public DessertItem(String name) {
		super();
		this.name = name;
	}

	public DessertItem() 
	{
		
	}
	abstract int CostCalcultor();

	final String ItenName() {
		return name;
	}
}
