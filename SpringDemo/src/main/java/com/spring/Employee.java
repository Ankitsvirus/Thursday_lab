package com.spring;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Emp_Id;
	
	@Column(name = "empaddress",length = 50)
	private String Address;
	
	@Column(length = 100)
	private String Emp_Name;
	
	
	public int getEmp_Id() {
		return Emp_Id;
	}
	public void setEmpId(int Emp_Id) {
		this.Emp_Id = Emp_Id;
	}
	public String getEmp_Name() {
		return Emp_Name;
	}
	public void setEmpName(String Emp_Name) {
		this.Emp_Name = Emp_Name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public Employee(int Emp_Id, String Emp_Name, String Address) {
		super();
		this.Emp_Id = Emp_Id;
		this.Emp_Name = Emp_Name;
		this.Address = Address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [Emp_Id=" + Emp_Id + ", Emp_Name=" + Emp_Name + ", Address=" + Address + "]";
	}
	
	
}