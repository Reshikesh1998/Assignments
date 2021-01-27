
public class AdvanceCalculator extends Calculator {
	public AdvanceCalculator() {
		System.out.println("inside child adv calculator");
	}
	
	public int fac(int a, int b) {
		
		System.out.println("hh"+super.add(1,1));
		
		for(int i=0;i<b;i++) 
		{
		System.out.println(i);
		a=a+1;
		}
		return a;}
	public int div(int a, int b) 
	{
		int c = a%b;
		return c;
	}
	
	

}
