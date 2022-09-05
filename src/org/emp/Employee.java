 package org.emp;

public class Employee {
    public void empId() {
    	System.out.println("Employee ID : 66335");
	}
   public void empName() {
	   System.out.println("Emloyee Name: Saravanan");
}
    public void empAddress() {
    	System.out.println("Employee Address :Chennai");
		
	}
    public void empPhoneno() {
    	System.out.println("Employee Mobile No : 9994567");
		
	}
    public static void main(String[] args) {
	 Employee emp = new Employee();
	 emp.empId();
	 emp.empName();
	 emp.empAddress();
	 emp.empPhoneno();
	 Test t = new Test();
	 t.studentName();
	 t.studentClass();
	 t.studentId();
    	
	}
}
