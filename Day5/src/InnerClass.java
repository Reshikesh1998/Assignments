
public class InnerClass  implements SimpleExample{
	
	static int  a =1;
	void a() {}
	
	
	public static void main(String[] args) {
		SimpleExample sub = (a,b) -> a-b;	
	}
	
	
	static class Inner implements SimpleExample
	{

		@Override
		public int addition(int a, int b) {
			return 0;
			// TODO Auto-generated method stub
			
		}
	
		}

	
//Anonymous inner class used for exclusive access of any method inside a class
	SimpleExample sub = new SimpleExample() {
		
		@Override
		public int addition(int a, int b) {
			System.out.println(a-b);
			return 0;
			
		}
	};
@Override
public int addition(int a, int b) {
	return 0;
	// TODO Auto-generated method stub
	
}

}
