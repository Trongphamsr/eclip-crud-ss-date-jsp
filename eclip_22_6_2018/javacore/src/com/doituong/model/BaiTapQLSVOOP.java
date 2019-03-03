package com.doituong.model;

public class BaiTapQLSVOOP {

	private String ho,ten;
	private int soSP;
	
	public BaiTapQLSVOOP(String ho, String ten, int soSP) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.soSP = soSP;
		if(soSP<0) {
			this.soSP=0;
		}
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
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	
	public double getLuong() {
		double donGia=0;
		if(this.soSP<=199) {
			donGia=0.5;
		}
		if(this.soSP<=399) {
			donGia=0.55;
		}
		if(this.soSP<=599) {
			donGia=0.6;
		}else {
			donGia=0.65;
		}
		return donGia*this.soSP;
	}
	
	public boolean lonHon(BaiTapQLSVOOP nv2) {
		return this.soSP>nv2.soSP;
	}
}
