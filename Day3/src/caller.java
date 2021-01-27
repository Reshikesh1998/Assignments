
public class caller {
	
	public static void main(String[] args) {
		//Employee e = new Employee();
		Employee e = Employee.createobject();
		Employee e2 = Employee.createobject();
		System.out.println(e2.getEname());
	
		System.out.println("Employee ID : "+e.getEid());
		System.out.println("Employee Name : "+e.getEname());
		System.out.println("Employee salary : "+e.getEsalary());
		
		
	
		
		AdvanceCalculator a= new AdvanceCalculator();
		int ab=a.div(1,2);
		System.out.println(ab);
		
		//creating advcal object using reference of parent class
		//the methods that are present in the parent class are the only availble methods to use
		//but the functionality will be that defined in the childclass
		//ex. divide in parent class returns quotient and child returns remainder here call is thorugh 
		//calculator but method that got invoked was from advcal
		Calculator c = new AdvanceCalculator();
		System.out.println(c.div(14,3));
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		Employee arr[] = {e,e2};
		
		for(Employee x : arr) 
		{
			x.setEname("sss");
			System.out.println(x.getEname());
		}
		
		
		final int ar[] = {1,3,4,5};
		ar[2] = 3;
		System.out.println(ar[2]);
	}

	

}
