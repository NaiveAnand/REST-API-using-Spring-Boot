package com.webservices.Revision;

public class Students {
	

	String name;
	int roll_no;
	String address;
	String section;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Students(String name, int roll_no, String address, String section) {
		this.name = name;
		this.roll_no = roll_no;
		this.address = address;
		this.section = section;
	}
	
	

}
