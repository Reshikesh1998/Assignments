
public class Manager  extends Employee{
	
	double eFoodAlloance;
	double eManagerAllowance;
	double eOtherAllowance;
	

	Manager(String ename, int ebasesalary) {
		super(ename, ebasesalary);
		eFoodAlloance = ebasesalary*0.08;
		eManagerAllowance =  ebasesalary*(0.1);
		eOtherAllowance = ebasesalary *(0.03);
	
		
	}
	
	
@Override
public double grosssalary(int basicsalary, double hra, double medical) {
	// TODO Auto-generated method stub
	this.egrossSalary = (int) (eFoodAlloance+eManagerAllowance+ eOtherAllowance+super.grosssalary(basicsalary, hra, medical));
	return this.egrossSalary;
}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Food Allowance :"+eFoodAlloance );
		System.out.println("Manager Allowance :"+eManagerAllowance);
		System.out.println("Other Allowance :"+eOtherAllowance);
	}
	

	
	

}
