package com.doituong.test;

import com.doituong.model.AbstractNV;
import com.doituong.model.AbstractThoiVu;

public class TestAbstract {

	public static void main(String[] args) {
		
		AbstractNV teo =new  AbstractNV(1,"a");
		teo.tinhLuong();
		AbstractThoiVu ty = new AbstractThoiVu(2,"b");
		ty.tinhLuong();
	}
}
