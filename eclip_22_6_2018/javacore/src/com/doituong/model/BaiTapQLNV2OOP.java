package com.doituong.model;

public abstract class BaiTapQLNV2OOP {

protected String name,address,phone;
	
	

	public BaiTapQLNV2OOP() {
	super();
	// TODO Auto-generated constructor stub
}

	public BaiTapQLNV2OOP(String name, String address, String phone) {
	super();
	this.name = name;
	this.address = address;
	this.phone = phone;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	@Override
	public String toString() {
		return this.name+" - "+this.address+" -"+this.phone;
	}
	
	public abstract double pay();
}
