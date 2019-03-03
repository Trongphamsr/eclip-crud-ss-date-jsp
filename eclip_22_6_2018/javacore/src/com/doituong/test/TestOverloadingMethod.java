package com.doituong.test;

import com.doituong.model.OverloadingMethod;

public class TestOverloadingMethod {
	public static void main(String[] args) {
		OverloadingMethod teo = new OverloadingMethod(1,"teo",9);
		teo.xetTotNghiep();
		teo.xetTotNghiep(4);
		teo.xetTotNghiep(9,1);
	}
}
