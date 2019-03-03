package com.model;

import java.sql.Timestamp;

public class LoginModel {

	private int id;
	private String username, password;
	private Timestamp createdate;
	// k biet bi sao nua
	public LoginModel(int id, String username, String password, Timestamp createdate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.createdate = createdate;
	}
	public LoginModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Timestamp getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}
	
	
}
