package com.bai24;

public class ChuoiJava {

	public static void main(String[] args) {
		String s1= new String();
		String s2 = new String("Obama");
		String s3="Obama";
		String s4 = new String("Obama");
		System.out.println("chieu dai s1 "+s1.length());
		System.out.println("chieu dai s1 "+s2.length());
		System.out.println("chieu dai s1 "+s3.length());
//		2 doi tuong tro tren 2 o nho khac nhau k bang nhau dk
		if(s2==s3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(s2==s4) {
			System.out.println("dung");
		}else {
			System.out.println("sai");
		}
		
		if(s2.equals(s3)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
