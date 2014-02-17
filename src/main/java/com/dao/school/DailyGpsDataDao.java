package com.dao.school;

import java.util.Arrays;

public class DailyGpsDataDao {


	private String device_id;
	private String date;
	private CoordinatesDao coordinates[];
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public CoordinatesDao[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(CoordinatesDao[] coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		return "DailyGpsDataDao [device_id=" + device_id + ", date=" + date
				+ ", coordinates=" + Arrays.toString(coordinates) + "]";
	}
	
}
