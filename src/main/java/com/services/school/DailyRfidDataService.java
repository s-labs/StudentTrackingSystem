package com.services.school;

import com.dao.school.DailyRfidDataDao;

public class DailyRfidDataService {

	public DailyRfidDataDao getDailyRfidData(){
		
		return new DailyRfidDataDao();
	}
	
}
