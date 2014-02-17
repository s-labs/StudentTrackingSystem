package com.dao.school;

public class SchoolDao {

	private String school_id;
	private String school_name;
	private String address;
	private String phone_number;
	private SchoolAdminDao schoolAdmin;
	public String getSchool_id() {
		return school_id;
	}
	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public SchoolAdminDao getSchoolAdmin() {
		return schoolAdmin;
	}
	public void setSchoolAdmin(SchoolAdminDao schoolAdmin) {
		this.schoolAdmin = schoolAdmin;
	}
	@Override
	public String toString() {
		return "School [school_id=" + school_id + ", school_name="
				+ school_name + ", address=" + address + ", phone_number="
				+ phone_number + ", schoolAdmin=" + schoolAdmin + "]";
	}
	
}
