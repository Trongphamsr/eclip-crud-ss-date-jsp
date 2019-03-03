package com.doituong.model;

public class SinhVienInterface implements KeThuaInterface, IGiaiTri{

	@Override
	public void complexity() {
		// TODO Auto-generated method stub
		System.out.println("cong viec kho");
		
	}

	@Override
	public void diffculty() {
		// TODO Auto-generated method stub
		System.out.println("cong viec phuc tap");
	}

	@Override
	public void hatHo() {
		// TODO Auto-generated method stub
		System.out.println("hat ho");
	}

}
