package com.doituong.test;

import java.util.ArrayList;
import java.util.Collections;

import com.doituong.model.ComparetoInterface;

public class TestCompareableto {

	public static void main(String[] args) {
		ArrayList<ComparetoInterface> dsSp = new ArrayList<ComparetoInterface>();
		dsSp.add(new ComparetoInterface(1,"coca",25));
		dsSp.add(new ComparetoInterface(2,"navi",16));
		dsSp.add(new ComparetoInterface(3,"Cam",20));
		dsSp.add(new ComparetoInterface(4,"qua",17));
		System.out.println("danh sach san pham");
		for(ComparetoInterface sp:dsSp) {
			System.out.println(sp);
		}
		Collections.sort(dsSp);
		System.out.println("danh sach san pham sau khi sap xep");
		for(ComparetoInterface sp:dsSp) {
			System.out.println(sp);
		}
	}
}
