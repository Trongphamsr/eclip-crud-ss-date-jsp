package com.model;

public class LoginModel {
	
	private int id;
	private String currentpass;
	private String newpass;
	public LoginModel(int id, String currentpass, String newpass) {
		super();
		this.id = id;
		this.currentpass = currentpass;
		this.newpass = newpass;
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
	public String getCurrentpass() {
		return currentpass;
	}
	public void setCurrentpass(String currentpass) {
		this.currentpass = currentpass;
	}
	public String getNewpass() {
		return newpass;
	}
	public void setNewpass(String newpass) {
		this.newpass = newpass;
	}
	
	
	
}
