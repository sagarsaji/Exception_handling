package ustbatchno3.exception;

//create an employee object with proper vALidations.
	//ph no should be 10 number.
	//email id
	//address
	//employeeid
	//empname
	//lcoation
	//salary


public class exception {
	private int salary;
	private String phno;
	private String emailid,address,empname,location;
	private int empid;
	public exception(String phno, int salary, String emailid, String address, String empname, String location,
			int empid) {
		super();
		this.phno = phno;
		this.salary = salary;
		this.emailid = emailid;
		this.address = address;
		this.empname = empname;
		this.location = location;
		this.empid = empid;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "exception [phno=" + phno + ", salary=" + salary + ", emailid=" + emailid + ", address=" + address
				+ ", empname=" + empname + ", location=" + location + ", empid=" + empid + "]";
	}
	
	
}
