package com.greatlearning.Assignments;

public class DepartmentDriver {
	
	public static void main(String args[]) {
		
		TechDepartment tech = new TechDepartment();
		HrDepartment HR = new HrDepartment();
		AdminDepartment admin = new AdminDepartment();
		
		admin.departmentName();
		admin.getTodaysWork();
		admin.getWorkDeadline();
		admin.isTodayAHoliday();
		
		HR.departmentName();
		HR.doActivity();
		HR.getTodaysWork();
		HR.getWorkDeadline();
		HR.isTodayAHoliday();
		
		tech.departmentName();
		tech.getTodaysWork();
		tech.getWorkDeadline();
		tech.getTechStackInformation();
		tech.isTodayAHoliday();
		
		
		
		
	}

}
