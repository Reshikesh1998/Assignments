

public class Calculator {
	
	public Calculator() {
		System.out.println("inside parent calculator");
	}

	public int add (int a, int b) 
	{
		return (a+b);
	}
	public int mul (int a, int b) 
	{
		return (a*b);
	}
	public int div (int a, int b) 
	{
		return (a/b);
	}
	public int sub (int a, int b) 
	{
		return (a-b);
	}
	

	public int add(int...nums) {
		
		int sum =0;
		for(int x:nums) 
		{
			sum = sum + x;
		}
		return sum;
	}
	
	
	
	
}
