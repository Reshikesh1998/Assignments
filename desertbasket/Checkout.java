package desertbasket;

public class Checkout {
	//candy, cookie, ice cream , sundae 
int items[] = new int[4];
String ItemnsinMenu[] = {"candy","cookie","iceCream","sundae"};

	Checkout()
	{
	 
	}

	public int[] CashRegister(int arr[]) 
	{
		return items;
		
	}
	
	public void NumberofItems(int arr[]) 
	{
		
		for(int i=0; i< arr.length;i++) 
		{
			System.out.println( this.ItemnsinMenu[i] +" : " +arr[i]  );
		}
		
		
	}
	
	public void CostofItems(int arr[]) 
	{
		
		Candy candy = new Candy(this.ItemnsinMenu[0], arr[0]);
		Cookie cookie = new Cookie(this.ItemnsinMenu[1],arr[1]);
		IceCream IceCream = new IceCream(this.ItemnsinMenu[2], arr[2]);
		Sundae Sundae = new Sundae (this.ItemnsinMenu[3], arr[3]);
		int total =candy.CostCalcultor() + cookie.CostCalcultor() +   IceCream.CostCalcultor()+ Sundae.CostCalcultor();
		
		
		    System.out.println("***************Reciept**********************");
		    System.out.println("Item "+"        Quantity "+" Cost ");
			System.out.println( this.ItemnsinMenu[0] + " "+ arr[0] +"    grams  : " + candy.CostCalcultor()   );
			System.out.println( this.ItemnsinMenu[1] + " "+ arr[1]+"    pieces : " +  cookie.CostCalcultor() );
			System.out.println( this.ItemnsinMenu[2] + " "+ arr[2]+"   unit   : " +   IceCream.CostCalcultor());
			System.out.println( this.ItemnsinMenu[3] +" " + arr[3]+"     unit   : " + Sundae.CostCalcultor() );
			System.out.println("Total Cost          : " + total );
			
		
		
		
	}
		
	
	

}
