
public class caller {
	public static void main(String[] args) {
		// Employee e = new Employee();
		Employee e = Employee.createobject();
		Employee e2 = Employee.createobject();
		System.out.println(e2.getEname());

		/*
		 * System.out.println("Employee ID : "+e.getEid());
		 * System.out.println("Employee Name : "+e.getEname());
		 * System.out.println("Employee salary : "+e.getEsalary());
		 */

		e.toString();
		System.out.println(e.equals(e2));
	}
}
