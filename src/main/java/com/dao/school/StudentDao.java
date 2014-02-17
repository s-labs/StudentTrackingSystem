package com.dao.school;

public class StudentDao {

	private String school_id;
	private String rfid;
	private String student_id;
	private String student_name;
	private String bus_id;
	private String stop_id;
	private ParentDao parent;
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
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getBus_id() {
		return bus_id;
	}
	public void setBus_id(String bus_id) {
		this.bus_id = bus_id;
	}
	public String getStop_id() {
		return stop_id;
	}
	public void setStop_id(String stop_id) {
		this.stop_id = stop_id;
	}
	public ParentDao getParent() {
		return parent;
	}
	public void setParent(ParentDao parent) {
		this.parent = parent;
	}
	@Override
	public String toString() {
		return "StudentDao [school_id=" + school_id + ", rfid=" + rfid
				+ ", student_id=" + student_id + ", student_name="
				+ student_name + ", bus_id=" + bus_id + ", stop_id=" + stop_id
				+ ", parent=" + parent + "]";
	}
	
}
