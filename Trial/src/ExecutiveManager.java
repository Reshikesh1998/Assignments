
public class ExecutiveManager extends Employee{
	
	double ePhoneAllowance;
	double eTourAllowance;
	double eKmTravelled = 0;
	
	ExecutiveManager(String ename, int ebasesalary, double eKmTravelled) {
		super(ename, ebasesalary);
		this.ePhoneAllowance = 1500;
		this.eTourAllowance =  eKmTravelled*5;
		
	}
	
	@Override
	public void display() {
		
		super.display();
		
		System.out.println("Food Allowance :"+ePhoneAllowance );
		System.out.println("Manager Allowance :"+eTourAllowance);
	
	}
	public double grosssalary(int basicsalary, double hra, double medical) {
		// TODO Auto-generated method stub
		this.egrossSalary = (int) (eTourAllowance+ ePhoneAllowance+super.grosssalary(basicsalary, hra, medical));
		return this.egrossSalary;
	}
	
}
