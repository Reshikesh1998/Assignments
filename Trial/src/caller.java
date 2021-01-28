
public class caller {
	public static void main(String[] args) {
		Employee e = new Employee("abc", 10000);
		//e.display();
		/*Employee e1 = new Employee("abc", 10000);
		e1.display();
		Employee e2 = new Employee("abc", 10000);
		e2.display();
		Employee e3 = new Employee("abc", 10000);
		e3.display();
		
		Employee e4 = new Employee("abc", 10000);
		e4.display();
	*/
		Manager m = new Manager("abx", 20000);
		m.display();
		
		System.out.println("******************************************");
		ExecutiveManager ex = new ExecutiveManager("xvc", 2200202, 200);
		ex.display();
		
		
		/*Calculator c = new Calculator();
		
		//System.out.println(c.add(0, 2));
		System.out.println(c.add( 10,20,23,30,99));
		*/
	}

}
