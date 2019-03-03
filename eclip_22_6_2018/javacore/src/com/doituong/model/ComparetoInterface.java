package com.doituong.model;

public class ComparetoInterface implements Comparable<ComparetoInterface> {

	private int ma;
	private String ten;
	private double gia;
	public ComparetoInterface() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ComparetoInterface(int ma, String ten, double gia) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
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
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	
	@Override
	public String toString() {
		
		return this.ma+"\t"+this.ten+"\t"+this.gia;
	}
	@Override
	public int compareTo(ComparetoInterface o) {
		// nhan -1 giam dan
		return  this.ten.compareTo(o.ten)*-1;
//		if(this.gia<o.gia) {
//			return -1;
//		}
//		if(this.gia>o.gia) {
//			return 1;
//		}
//		return 0;
	}
	
}