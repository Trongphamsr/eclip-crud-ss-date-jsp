package com.doituong.model;

public class AliasVaGomtudong implements Cloneable{ 

	// co 2 vung nho a va b, 1 vung no ma co 2 doi tuong goi la alias con neu vung nho bi rong thi no bi thu hoi goi la co che gom tu dong

	private int ma;
	private String ten;
	public AliasVaGomtudong(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	public AliasVaGomtudong() {
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

	public AliasVaGomtudong copy() {
		try {
			return (AliasVaGomtudong) this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
