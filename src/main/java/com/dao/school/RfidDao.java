package com.dao.school;

public class RfidDao {

	private String rfid_number;
	private String rfid_type;
	private boolean available;
	public String getRfid_number() {
		return rfid_number;
	}
	public void setRfid_number(String rfid_number) {
		this.rfid_number = rfid_number;
	}
	public String getRfid_type() {
		return rfid_type;
	}
	public void setRfid_type(String rfid_type) {
		this.rfid_type = rfid_type;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "RfidDao [rfid_number=" + rfid_number + ", rfid_type="
				+ rfid_type + ", available=" + available + "]";
	}
		
}
