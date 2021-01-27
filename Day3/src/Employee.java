
public class Employee {
	
	private int eid;
	private String ename;
	private int esalary;
	static Employee e;
	
	
	private Employee ()
	{
		eid = 1;
		ename= "abc";
		esalary = 200000;
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	/** this method creates the object of the class
	 * it is a static method
	 */
	public void setEname(String ename) {
		
		this.ename = ename;
	}
	
	public int getEsalary() {
		return esalary;
	}
	
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	
	public static Employee createobject() 
	
	{
		/** this method creates the object of the class
		 * it is a static method
		 */
		if (e == null) 
		{
			
			Employee e= new Employee();
			return e;
		}
		else
		{
		System.out.println("MAxiimum limit reached");
		return e;
		}
	}

}
