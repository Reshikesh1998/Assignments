
import java.io.*;
import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[] = { 1, 30, 21, 44, 34, 57, 32, 33 };
		int b[] = { 33, 32, 1, 30, 21, 44, 34, 57 };

		
		
		//if (Arrays.sort(a)== Arrays.sort(b))
		//}
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		for (int i=0;i<a.length;i++) 
		{
			if (a[i] == b[i]) 
			{
				continue;
			}
			else 
			{
				System.out.println("not same");
				break;
			}
		}
		System.out.println("same");
		
}
}

