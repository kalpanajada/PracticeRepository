import java.util.Scanner;
public class Employee {

	int employeeid;
	String employeename;
	int employeesalary;
	char active;
	
	
	
public Employee(int employeeid, String employeename, int employeesalary, char active) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
		this.active = active;
}









public void displaydetails()
{
	System.out.println("Employee details as follows");
	System.out.println("Employee Id" + employeeid);
	System.out.println("Employee Name" + employeename);
	System.out.println("Employee Salary" + employeesalary);
	System.out.println("Status" + active);
	
}


}