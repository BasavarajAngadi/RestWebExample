package com.braj.vo;

public class CustomerVO {
	
	String name;
	String desgination;
	Integer salary;
	String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "CustomerVO [name=" + name + ", desgination=" + desgination
				+ ", salary=" + salary + ", city=" + city + "]";
	}
	

}
