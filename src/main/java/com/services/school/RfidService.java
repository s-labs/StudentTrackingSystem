package com.services.school;

import java.util.List;

import com.dao.school.RfidDao;

public class RfidService {

	public List<RfidDao> getAllRfids(){
		
		List<RfidDao> rfids=null;
		return rfids;
	}
	public RfidDao getRfid(){
		
		return new RfidDao();
	}
	public void updateRfid(){
		
	}
	public void removeRfid(String rfid_number){
		
	}
}

