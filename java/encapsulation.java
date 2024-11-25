
public class encapsulation {
     private String EmpName;
     private int EmpId;
     private String EmpDesignation;
     
     public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		this.EmpName = empName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		this.EmpId = empId;
	}
	public String getEmpDesignation() {
		return EmpDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.EmpDesignation = empDesignation;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	private float sal;
     
	public static void main(String[] args) {
		encapsulation en=new encapsulation();
		en.setEmpName("Soumya");
		en.setEmpId(12);
		en.setEmpDesignation("ASE");
		en.setSal(24444.44f);
		System.out.println("Name : "+en.getEmpName());
		System.out.println("Id : "+en.getEmpId());
		System.out.println("Designation : "+en.getEmpDesignation());
		System.out.println("salary : "+en.getSal());
		
	}
}

