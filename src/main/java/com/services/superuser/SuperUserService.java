package com.services.superuser;

import com.dao.superuser.SuperUserLoginDao;

public class SuperUserService {

	public SuperUserLoginDao getSuperUser(){
		
		return new SuperUserLoginDao();
	}
	public void updateSuperUserDetails(){
		
	}
}
