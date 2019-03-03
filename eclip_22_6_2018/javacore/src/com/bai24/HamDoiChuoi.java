package com.bai24;

public class HamDoiChuoi {

	public static void main(String[] args) {
		String s =" xin chao ong obama";
		String s1= s.replace("obama", "putin");
		System.out.println(s);
		System.out.println(s1);
		
		s="obama xin chao miciko obama";
		s=s.replaceFirst("obama", "putin");
		System.out.println(s);
		
		String s3 = "anh a chao anh hop";
		String s4=s3.replaceFirst("anh", "em");
		System.out.println(s3);
		System.out.println(s4);
	}
}
