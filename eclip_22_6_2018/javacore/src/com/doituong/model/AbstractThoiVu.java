package com.doituong.model;

public class AbstractThoiVu extends AbstractClass{

	@Override
	public void tinhLuong() {
		System.out.println("nhan vien thoi vu tinh luong");
	}

	public AbstractThoiVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AbstractThoiVu(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}

}
