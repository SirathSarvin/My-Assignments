package week2.day4;

public class EmployeDetails {
	public void Employename(String empName,int empID) {
		System.out.println("Employename =" +empName);
		System.out.println("EmployeID ="+empID);
	}
	public void getEmployeaddress(String empAddress) {
		System.out.println("Employeaddress =" +empAddress);
		}
	public void printEmpSalary(double empSalary) {
		System.out.println("EmployeSalary =" +empSalary);
		}
	public void empMobileNumber(long mobileNum) {
		System.out.println("Employee Mobile Number=" +mobileNum);
		}
	public static void main(String[] args) {
		 EmployeDetails emp = new EmployeDetails();
		     emp.Employename("sirath", 2325);
		     emp.getEmployeaddress("233, velachery, Chennai");
		     emp.printEmpSalary(45000.50);
		     emp.empMobileNumber(987654566);
		     
		        
	}

}
