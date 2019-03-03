package com.doituong.test;

import com.doituong.model.KeThuaExtends;
import com.doituong.model.KeThuaExtensss;

public class TestKeThua {

	public static void main(String[] args) {
		KeThuaExtends  teo = new KeThuaExtends(1,"a");
		KeThuaExtensss ty = new KeThuaExtensss(2,"b");
		teo.tinhLuong();
		ty.tinhLuong();
	}
}
