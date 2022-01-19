package com.webapp.Employee_mangament.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int Id;

	private String address;

	@Temporal(TemporalType.DATE)
	private Date doB;

	private String email;

	@Column(name="emp_address")
	private String empAddress;

	@Column(name="emp_mobile_nos")
	private String empMobileNos;


	@Column(name="emp_name")
	private String empName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date empdob;

	private int empid;

	private BigInteger empmobino;

	private String empname;

	@Column(name="first_name")
	private String firstName;

	private int id;

	@Column(name="last_name")
	private String lastName;

	private String name;

	@Column(name="phone_number")
	private String phoneNumber;

	private double salary;

	//bi-directional many-to-one association to Address
	@ManyToOne
	@JoinColumn(name="PS_No")
	private Address addressBean;

	public Employee() {
	}

	public int getId() {
		return this.Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDoB() {
		return this.doB;
	}

	public void setDoB(Date doB) {
		this.doB = doB;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpAddress() {
		return this.empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpMobileNos() {
		return this.empMobileNos;
	}

	public void setEmpMobileNos(String empMobileNos) {
		this.empMobileNos = empMobileNos;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getEmpdob() {
		return this.empdob;
	}

	public void setEmpdob(Date empdob) {
		this.empdob = empdob;
	}

	public int getEmpid() {
		return this.empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public BigInteger getEmpmobino() {
		return this.empmobino;
	}

	public void setEmpmobino(BigInteger empmobino) {
		this.empmobino = empmobino;
	}

	public String getEmpname() {
		return this.empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddressBean() {
		return this.addressBean;
	}

	public void setAddressBean(Address addressBean) {
		this.addressBean = addressBean;
	}

}