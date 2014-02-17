package com.dao.school;

public class CoordinatesDao {

	private String session;//Morning or Evening
	private String Lat;
	private String Long;
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
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
	@Override
	public String toString() {
		return "CoordinatesDao [session=" + session + ", Lat=" + Lat
				+ ", Long=" + Long + "]";
	}
	
}
