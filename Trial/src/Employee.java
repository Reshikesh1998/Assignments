
public class Employee {

	int eid;
	String ename;
	int ebasesalary, egrossSalary, enetsalary;
	double HRA, PF;
	int pt = 200;
	int emedical = 100;
	static String address = "Thinkitive Technologies";
	static int telno = 33333333;
	static long uid=0;

	Employee(String ename, int ebasesalary) {
		
		this.ename = ename;
		this.ebasesalary = ebasesalary;
	}

	public double hracalculator(int basicsalary) {

		return (0.5 * basicsalary);
	}

	public double pfcalculator(int basicsalary) {

		return (0.12 * basicsalary);
	}

	public double netsalary(int basicsalary, double pf, int pt) {

		return (basicsalary - pf - pt);
	}

	public double grosssalary(int basicsalary, double hra, double medical) {

		return (basicsalary + hra + medical);

	}

	public void display() {
		uid= uid+1;
		System.out.println("Employee ID : " + uid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Base Salary : " + ebasesalary);
		System.out.println("Employee PT :" + pt);
		System.out.println("Employee HRA : " + hracalculator(ebasesalary));
		System.out.println("Employee PF :" + pfcalculator(ebasesalary));
		System.out.println("Employee Gross Salary : " + grosssalary(ebasesalary, hracalculator(ebasesalary), emedical));
		System.out.println("Employee Net Salary : " + netsalary(ebasesalary, pfcalculator(ebasesalary), pt));
		System.out.println("Company Address : "+ address);
		System.out.println("Telephone : "+ telno);
		
	}

}
