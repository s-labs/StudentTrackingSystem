package com.dao.school;

public class BusStopsDao {

	private String stop_id;
	private String stop_name;
	private String Lat;
	private String Long;
	private String expected_time;
	public String getStop_id() {
		return stop_id;
	}
	public void setStop_id(String stop_id) {
		this.stop_id = stop_id;
	}
	public String getStop_name() {
		return stop_name;
	}
	public void setStop_name(String stop_name) {
		this.stop_name = stop_name;
	}
	public String getLat() {
		return Lat;
	}
	public void setLat(String lat) {
		Lat = lat;
	}
	public String getLong() {
		return Long;
	}
	public void setLong(String l) {
		Long = l;
	}
	public String getExpected_time() {
		return expected_time;
	}
	public void setExpected_time(String expected_time) {
		this.expected_time = expected_time;
	}
	@Override
	public String toString() {
		return "BusStopsDao [stop_id=" + stop_id + ", stop_name=" + stop_name
				+ ", Lat=" + Lat + ", Long=" + Long + ", expected_time="
				+ expected_time + "]";
	}
	
}
