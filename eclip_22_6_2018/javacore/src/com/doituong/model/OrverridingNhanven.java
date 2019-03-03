package com.doituong.model;

public class OrverridingNhanven extends Overriding {

	@Override
	public void tinhLuong(int ngayCong) {
		if(ngayCong<20)
			System.out.println(" luong ban la 12 trieu");
		else
			System.out.println("luong cua ban la 25 trieu");
	}

}
