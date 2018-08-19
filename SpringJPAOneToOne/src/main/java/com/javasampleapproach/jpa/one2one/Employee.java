//package com.javasampleapproach.jpa.one2one;
//
//import java.io.Serializable;
//import javax.persistence.*;
//
//
///**
// * The persistent class for the employee database table.
// * 
// */
//@Entity
//@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
//public class Employee implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="emp_id")
//	private int empId;
//
//	@Column(name="emp_name")
//	private String empName;
//
//	public Employee() {
//	}
//
//	public int getEmpId() {
//		return this.empId;
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public String getEmpName() {
//		return this.empName;
//	}
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//
//}