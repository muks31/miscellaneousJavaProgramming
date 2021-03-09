package com.mukscode.troubleshooting;

import java.util.ArrayList;
import java.util.List;

public class AssociationExample {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Prastuti", "Math");
		Teacher t2 = new Teacher("Ramesh", "Science");
		
		List<Teacher> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		Department d = new Department("Computer Science");
		d.setDepartment(list);
		
		System.out.println(d.getTeachers() +" are the list of teachers in the department "+d.getDeptName());

	}

}

class Teacher{
	String name;
	String subject;
	
	Teacher(String name, String subject){
		this.name = name;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return  name ;
	}
	
}

class Department{
	
	List<Teacher> teachers;
	String deptName;
	
	Department(String deptName){
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDepartment(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	
}
