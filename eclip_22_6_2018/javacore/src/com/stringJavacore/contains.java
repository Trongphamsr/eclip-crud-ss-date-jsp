package com.stringJavacore;

public class contains {

	public static void main(String[] args) {
		
		// contains dung tim trong thang chuoi neu co chuoi do tra ve thi no se tra ve true
		
		String s1 = "toi ten la pham van trong";
		System.out.println(s1.contains("ten toi la pham"));
		System.out.println(s1.contains("trong"));
		System.out.println(s1.contains("hello")); 
		System.out.println(s1.contains("t"));
	}
}
