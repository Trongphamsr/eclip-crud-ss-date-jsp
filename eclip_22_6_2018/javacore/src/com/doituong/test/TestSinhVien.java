package com.doituong.test;

import com.doituong.model.SinhVien;

public class TestSinhVien {

	// lay thong tin dung get  set thong tin dung set
	public static void main(String[] args) {
		SinhVien a = new SinhVien("c");
		SinhVien b = new SinhVien("b",8);
		System.out.println("diem b la "+ b.getDiem());
		System.out.println("diem b la "+ b.getHoTen());
		System.out.println(a.getHoTen());
		a.setHoTen("ong obama");
		System.out.println(a.getHoTen());
		b.xuatThongTin();
		System.out.println(b);
	}
}
