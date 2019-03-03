package com.doituong.test;

import com.doituong.model.DaHinh;
import com.doituong.model.DahinhHinhVuong;
import com.doituong.model.DahinhHinhcn;

public class TestDahinh {

	public static void main(String[] args) {
			
		DaHinh h ;
		h= new DahinhHinhcn(4,6);
		System.out.println("chu vi = "+h.tinhChuVi());
		System.out.println("dien tich = "+h.tinhDienTich());
		
		
	}
}