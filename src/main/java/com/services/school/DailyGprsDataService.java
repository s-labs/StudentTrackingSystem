package com.services.school;

import com.dao.school.DailyGpsDataDao;

public class DailyGprsDataService {

	
	public DailyGpsDataDao getLatestGprsData(){
		
		return new DailyGpsDataDao();
	}
	
}
