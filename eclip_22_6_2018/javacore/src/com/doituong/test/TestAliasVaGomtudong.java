package com.doituong.test;

import com.doituong.model.AliasVaGomtudong;

public class TestAliasVaGomtudong {

	public static void main(String[] args) {
		AliasVaGomtudong nv1 = new AliasVaGomtudong(1,"a");
		AliasVaGomtudong nv2 = new AliasVaGomtudong(2,"b");
		nv1=nv2;
		nv2.setTen("c");
		System.out.println("ten nv 1 "+nv1.getTen());
		
		AliasVaGomtudong nv3 = new AliasVaGomtudong(3,"f");
		AliasVaGomtudong nv4 = new AliasVaGomtudong(4,"g");
		nv3=nv4.copy();
		System.out.println("ten nv 3 "+nv3.getTen());
		nv4.setTen("kkk");
		System.out.println("ten nv 3 "+nv3.getTen());
		nv3=nv4.copy();
		System.out.println("ten nv 3 "+nv3.getTen());
		
	}
}
