package com.bai24;

public class SosanhChuoi {
	public static void main(String[] args) {
		String s1="an";
		String s2="AN";
		int kq=s1.compareTo(s2);
		System.out.println(kq);
		int kq2=s1.compareToIgnoreCase(s2);
		System.out.println(kq2);
		
//		equals tra ve tru false, compareto thi no tra ve lon hon nho hn hay = nhau
		
		if(s1.equals(s2)) {
			System.out.println("ok");
		}else {
			System.out.println("no ok");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("ok");
		}else {
			System.out.println("no ok");
		}
	}
}
