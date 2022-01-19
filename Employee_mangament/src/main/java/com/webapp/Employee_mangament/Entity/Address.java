package com.webapp.Employee_mangament.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the address database table.
 * 
 */
@Entity
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;

	private String address;

	private String address2;

	private String addresscol;

	private String city;

	@Column(name="city_id")
	private int cityId;

	private String country;

	private String dist;

	private String district;

	@Column(name="last_update")
	private Timestamp lastUpdate;

	private Object location;

	private String phone;

	private int pin_code;

	@Column(name="postal_code")
	private String postalCode;

	private int PS_No_add;

	private String state;

	private String tal;

	//bi-directional many-to-one association to Employee
	@OneToMany(mappedBy="addressBean")
	private List<Employee> employees;

	public Address() {
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddresscol() {
		return this.addresscol;
	}

	public void setAddresscol(String addresscol) {
		this.addresscol = addresscol;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCityId() {
		return this.cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDist() {
		return this.dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Object getLocation() {
		return this.location;
	}

	public void setLocation(Object location) {
		this.location = location;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPin_code() {
		return this.pin_code;
	}

	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getPS_No_add() {
		return this.PS_No_add;
	}

	public void setPS_No_add(int PS_No_add) {
		this.PS_No_add = PS_No_add;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTal() {
		return this.tal;
	}

	public void setTal(String tal) {
		this.tal = tal;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setAddressBean(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setAddressBean(null);

		return employee;
	}

}