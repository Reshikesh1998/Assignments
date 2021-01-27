
public class StringOperations {
	
	
	
	public String firstlettercap(String s) 
	{
		String fletter = s.substring(0,1);
		String remainingletters = s.substring(1, s.length()); 
		return (fletter.toUpperCase()+remainingletters);
	}
	
	public void ReverseString(String s) 
	{
		String arr[] =s.split(" ");
		for (int i = arr.length -1 ; i>=0;i-- ) 
		{
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println();
	}
	
	public void  FirstLetterCaps(String s) 
	{
		String arr [] =s.split(" ");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print((firstlettercap(arr[i] + " ")));
		}
		System.out.println();
	} 
	
	public void reversewords(String s) 
	{
		String arr [] = s.split(" ");
		for (int i = 0; i< arr.length;i++ ) 
		{
			for (int j = arr[i].length()-1; j>=0; j--) 
			{
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
			
		}
		System.out.println();
		
	}
	
	
	public void WordFrequency(String s) 
	{
		String arr[] = s.toLowerCase().split(" ");
		
		
		for(int i=0;i<arr.length;i++) 
		{
			String sub = arr[i];
			int count=0;
			for(int j=0;j<arr.length;j++) 
			{
				if(arr[j].toLowerCase().equals(sub)) 
				{
					
					count=count + 1;
				}
				else
					continue;
			}
			System.out.println(sub + " : " + count);
			
			
		}
		System.out.println();
		
	}

}
