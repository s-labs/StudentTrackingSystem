package com.dao.school;

public class ParentDao {

	private String relation_name;
	private String parent_name;
	private String phone_number;
	private String address;
	private String email;
	public String getRelation_name() {
		return relation_name;
	}
	public void setRelation_name(String relation_name) {
		this.relation_name = relation_name;
	}
	public String getParent_name() {
		return parent_name;
	}
	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "ParentDao [relation_name=" + relation_name + ", parent_name="
				+ parent_name + ", phone_number=" + phone_number + ", address="
				+ address + ", email=" + email + "]";
	}
	
}
