package com.bai24;

public class TachChuoi {
	public static void main(String[] args) {
		String s="obama;putin;kim jong un";
		String[] arr=s.split(";");
		for(String name:arr) {
			System.out.println(name);
		}
		
		String s1 ="SV001.pham van trong.DHPTIT";
		String[] arr1=s1.split("\\.");
		if(arr1.length==3) {
			System.out.println("ma= "+arr1[0]);
			System.out.println("ten= "+arr1[1]);
			System.out.println("truong= "+arr1[2]);
		}
		System.out.println("-----------------");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("-----------------");
		for (String x :arr1) {
			System.out.println(x);
		}
	}
}
