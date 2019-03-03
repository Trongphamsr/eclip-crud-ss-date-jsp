package com.bai80;

import java.io.Serializable;

public class serializeKhachHang implements Serializable {

	public serializeKhachHang(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	public serializeKhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int ma;
	private String ten;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
}
