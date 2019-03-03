package com.bai24;

public class DoiChuHoaThanhThuong {

	public static void main(String[] args) {
		String s="obamaM".toUpperCase();
		System.out.println(s);
		
		String s1="PUTINn".toLowerCase();
		System.out.println(s1);
		
		String s2 = "pham van trong";
		s2=s2.replaceFirst("p","p".toUpperCase());
		System.out.println(s2);
		
		s2="anh hop";
		s2=s2.replaceFirst(
				(s2.charAt(0)+ ""),(s2.charAt(0)+"").toUpperCase());
		System.out.println(s2);
	}
}
