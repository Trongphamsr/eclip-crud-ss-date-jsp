package com.doituong.test;

import com.doituong.model.TamGiac;

public class TestTamGiac {

	public static void main(String[] args) {
		TamGiac tg1= new TamGiac(20,12,25);
		System.out.println("chu vi= "+tg1.tinhChuVi());
		System.out.println("dien tich= "+tg1.tinhDienTich());
		
		// service method public
		// subport method private
	}
}
