package com.model;

public class Thanhvien {

	private int stt;
	private String ho,ten,tk;
	public Thanhvien(int stt, String ho, String ten, String tk) {
		super();
		this.stt = stt;
		this.ho = ho;
		this.ten = ten;
		this.tk = tk;
	}
	public Thanhvien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTk() {
		return tk;
	}
	public void setTk(String tk) {
		this.tk = tk;
	}
	
	
}
