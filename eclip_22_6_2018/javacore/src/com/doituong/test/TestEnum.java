package com.doituong.test;

import java.util.ArrayList;

import com.doituong.model.EnumJava;

public class TestEnum {

	public static void main(String[] args) {
		ArrayList<EnumJava> dsSV = new ArrayList<>();
		dsSV.add(new EnumJava(1,"a",7));
		dsSV.add(new EnumJava(2,"b",8));
		dsSV.add(new EnumJava(3,"c",6));
		dsSV.add(new EnumJava(4,"d",4));
		dsSV.add(new EnumJava(5,"e",6.5));
		dsSV.add(new EnumJava(6,"f",9));
		
		System.out.println("ds sinh vien");
		for(EnumJava sv : dsSV) {
			System.out.println(sv);
		}
		
	}
}
