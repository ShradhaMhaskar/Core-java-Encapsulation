package Encapsulation;

public class MainClassOfEmp {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmp_Id(1424);
		emp.setEmpName("Ram");
		emp.setAge(22);
		emp.setGender("Male");
		emp.setDepartment("Development");
		emp.setDesignation("Developer");
		emp.setSalary(45000.0);
		emp.setPhoneNo(24351436163l);
		emp.setEmail("ram@gmail.com");
		emp.setCity("pune");
		emp.setAddress("Nigadi,pune");
		emp.setJoiningYear(2024);
		emp.setExperience(2.5);
		emp.setQualification("BCA");
		emp.setisPermanent(false);
		
		System.out.println("Employee ID : " +emp.getEmp_Id());
		System.out.println("Employee Name : "+emp.getEmpName());
		System.out.println("Age : " +emp.getAge());
		System.out.println("Gender : " +emp.getGender());
		System.out.println("Department : " +emp.getDepartment());
		System.out.println("Designation : " +emp.getDesignation());
		System.out.println("Salary : " +emp.getSalary());
		System.out.println("Contact Number : " +emp.getPhoneNo());
		System.out.println("Email : " +emp.getEmp_Id());
		System.out.println("City : " +emp.getCity());
		System.out.println("Address : " +emp.getAddress());
		System.out.println("Joining Year : " +emp.getJoiningYear());
		System.out.println("Experience : " +emp.getExperience());
		System.out.println("Qualofication : " +emp.getQualification());
		System.out.println("Is Permanent : " +emp.getisPermanent());
		
	}

}
