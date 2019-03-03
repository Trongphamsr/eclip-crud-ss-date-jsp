package com.doituong.model;

public class DahinhHinhcn extends DaHinh{

	public DahinhHinhcn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DahinhHinhcn(int hieuDai, int chieuRong) {
		super(hieuDai, chieuRong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhChuVi() {
		
		return (this.getHieuDai()+this.getChieuRong())*2;
	}

	@Override
	public double tinhDienTich() {
		
		return this.getHieuDai()*this.getChieuRong();
	}

}
