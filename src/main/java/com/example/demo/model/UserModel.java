package com.example.demo.model;

import java.util.List;

public class UserModel {
	
	private String userName;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}

	private String password;
	private List<String> roleList;

	public UserModel(String userName, String password, List<String> roleList) {
		this.userName = userName;
		this.password = password;
		this.roleList = roleList;
	}

	
}
