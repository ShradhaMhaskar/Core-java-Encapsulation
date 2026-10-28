package Encapsulation;

public class Employee {
	private int emp_Id;
	private String empName;
	private int emp_age;
	private String emp_gender;
	private String emp_department;
	private String designation;
	private double salary;
	private long phoneNo;
	private String email;
	private String city;
	private String address;
	private int joiningYear;
	private double experience;
	private String qualification;
	private boolean isPermanent;

	public void setEmp_Id(int id) {
		this.emp_Id = id;
	}

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmpName(String name) {
		this.empName = name;
	}

	public String getEmpName() {
		return empName;
	}

	public void setAge(int age) {
		this.emp_age = age;
	}

	public int getAge() {
		return emp_age;
	}

	public void setGender(String gender) {
		this.emp_gender = gender;
	}

	public String getGender() {
		return emp_gender;
	}

	public void setDepartment(String department) {
		this.emp_department = department;
	}

	public String getDepartment() {
		return emp_department;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

	public int getJoiningYear() {
		return joiningYear;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public double getExperience() {
		return experience;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getQualification() {
		return qualification;
	}

	public void setisPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	public boolean getisPermanent() {
		return isPermanent;
	}

}
