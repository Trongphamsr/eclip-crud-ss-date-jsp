package com.doituong.model;

public class KeThua {

//	contructor k ke thua, muon sd dung tu khoa supper , goi lai cai contructor do
	private int ma;
	private String ten;
	
	public KeThua() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KeThua(int ma, String ten) {
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
	
	public void tinhLuong() {
		System.out.println("luong nhan vien "+this.ten);
	}
}
