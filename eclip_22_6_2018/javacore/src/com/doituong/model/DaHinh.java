package com.doituong.model;

public abstract class DaHinh {
	private int hieuDai;
	private int chieuRong;
	
	public abstract double tinhChuVi();
	public abstract double tinhDienTich();
	
	public DaHinh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DaHinh(int hieuDai, int chieuRong) {
		super();
		this.hieuDai = hieuDai;
		this.chieuRong = chieuRong;
	}
	public int getHieuDai() {
		return hieuDai;
	}
	public void setHieuDai(int hieuDai) {
		this.hieuDai = hieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	

}
