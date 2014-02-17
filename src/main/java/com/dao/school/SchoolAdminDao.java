package com.dao.school;

public class SchoolAdminDao {

	private String user_name;
	private String login_id;
	private String password;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SchoolAdmin [user_name=" + user_name + ", login_id=" + login_id
				+ ", password=" + password + "]";
	}
	
}
