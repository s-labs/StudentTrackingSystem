package com.dao.school;

import java.util.Arrays;

public class BusDao {

	private String school_id;
	private String bus_id;//Unique ID
	private String driver_id;
	private String device_id;
	private BusStopsDao bus_stops[];
	public String getSchool_id() {
		return school_id;
	}
	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}
	public String getBus_id() {
		return bus_id;
	}
	public void setBus_id(String bus_id) {
		this.bus_id = bus_id;
	}
	public String getDriver_id() {
		return driver_id;
	}
	public void setDriver_id(String driver_id) {
		this.driver_id = driver_id;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public BusStopsDao[] getBus_stops() {
		return bus_stops;
	}
	public void setBus_stops(BusStopsDao[] bus_stops) {
		this.bus_stops = bus_stops;
	}
	@Override
	public String toString() {
		return "BusDao [school_id=" + school_id + ", bus_id=" + bus_id
				+ ", driver_id=" + driver_id + ", device_id=" + device_id
				+ ", bus_stops=" + Arrays.toString(bus_stops) + "]";
	}
	
	
}
