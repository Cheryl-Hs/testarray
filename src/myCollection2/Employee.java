package myCollection2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {     //Javabean,实体类
	private int id;
	private String name;
	private int salary;
	private String department;
	private Date hireDate;
	
	
	public Employee(int id, String name, int salary, String department, String hireDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		
		DateFormat format = new SimpleDateFormat("yyyy-MM");
		try {
			this.hireDate = format.parse(hireDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartmen() {
		return department;
	}
	public void setDepartmen(String departmen) {
		this.department = departmen;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
}