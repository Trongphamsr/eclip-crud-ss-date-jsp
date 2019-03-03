package com.doituong.model;

public abstract class AbstractClass {

	// k ke thua, k new la 1 lop truu tuong, k co than ham
	private int ma;
	private String ten;
	
	public AbstractClass(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	public AbstractClass() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	
	public abstract void tinhLuong();
}
