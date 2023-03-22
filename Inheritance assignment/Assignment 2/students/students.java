package org.students;

import org.department.Department;

public class students extends Department {
	public void studentName() {
		System.out.println("Student Name : Sirath Sarvin");
	}
	public void studentDept() {
		System.out.println("Student Depatment : Computer Science and Engineering");
	}
	public void studentId() {
		System.out.println("Student ID :007");
	}
	public static void main(String[] args) {
		students details = new students();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		details.departmentName();
		details.studentName();
		details.studentDept();
		details.studentId();
	}

}
