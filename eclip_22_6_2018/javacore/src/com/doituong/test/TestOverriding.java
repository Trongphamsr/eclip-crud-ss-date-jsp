package com.doituong.test;

import com.doituong.model.OrveridngThoivu;
import com.doituong.model.OrverridingNhanven;

public class TestOverriding {

	public static void main(String[] args) {
		
		OrverridingNhanven teo = new OrverridingNhanven();
		teo.tinhLuong(20);
		
		OrveridngThoivu ty = new OrveridngThoivu();
		ty.tinhLuong(20);
	}
}
