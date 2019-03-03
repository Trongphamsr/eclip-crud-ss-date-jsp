package com.bai80;

import java.io.Serializable;
import java.util.Date;

public class BaiTapFile implements Serializable{

	private int ma;
	private String ten;
	private Date namSing;
	
	public BaiTapFile(int ma, String ten, Date namSing) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.namSing = namSing;
	}
	public BaiTapFile() {
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
	public Date getNamSing() {
		return namSing;
	}
	public void setNamSing(Date namSing) {
		this.namSing = namSing;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ma+ " - "+this.ten+" - "+BaiTapFileDateConverter.fromDate(this.namSing);
	}
}
