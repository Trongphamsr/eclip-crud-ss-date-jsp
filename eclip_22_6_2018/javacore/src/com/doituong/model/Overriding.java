package com.doituong.model;

public abstract class Overriding {
	
	// overloadding cung ten khac kieu, nam trong 1 class
	// nguoc lai la overriding
	private int ma;
	private String ten;
	public Overriding() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Overriding(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
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
	
	public abstract void tinhLuong(int ngayCong);
}
