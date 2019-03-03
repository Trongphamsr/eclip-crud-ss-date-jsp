package com.bai80;

import java.io.Serializable;

public class BaiTapSerializeDanhBa implements Serializable {

	private String ten,phone;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BaiTapSerializeDanhBa(String ten, String phone) {
		super();
		this.ten = ten;
		this.phone = phone;
	}

	public BaiTapSerializeDanhBa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ten+"\t"+this.phone;
	}
}
