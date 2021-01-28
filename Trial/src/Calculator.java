
public class Calculator {

	/*public int add (int a, int b) 
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
	
	public float add (int a, float b) 
	{
		return (a+b);
	}
	public float add (float a, int b) 
	{
		return (a+b);
	}
	public int add (byte a, byte b) 
	{
		return (a+b);
	}
	public float add (float a, float b) 
	{
		return (a+b);
	}*/
	public int add(int...nums) {
		
		int sum =0;
		for(int x:nums) 
		{
			sum = sum + x;
		}
		return sum;
	}
	
	
	
	
}
