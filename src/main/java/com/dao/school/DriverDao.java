package com.dao.school;

public class DriverDao {

	private String school_id;
	private String rfid;
	private String driver_id;
	private String driver_name;
	
	private String phone_number;
	private String address;
	public String getSchool_id() {
		return school_id;
	}
	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public String getDriver_id() {
		return driver_id;
	}
	public void setDriver_id(String driver_id) {
		this.driver_id = driver_id;
	}
	public String getDriver_name() {
		return driver_name;
	}
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "DriverDao [school_id=" + school_id + ", rfid=" + rfid
				+ ", driver_id=" + driver_id + ", driver_name=" + driver_name
				+ ", phone_number=" + phone_number
				+ ", address=" + address + "]";
	}
	
}
