package com.bai24;

public class NoiVaChenChuoi {
	public static void main(String[] args) {
//		k nen dung dau + noi chuoi vi moi lan noi chuoi la tao ra 1 object khien ton bo nho
		String s="obama";
		s=s+" putin";
		s=s+" putin "+ (1+2);
		System.out.println(s);
		
		StringBuilder bd = new StringBuilder();
		bd.append("obama");
		bd.append("\t");
		
		bd.append("putin");
		bd.append("\t");
		
		bd.append("un");
		bd.append("\t");
		
		bd.append("hop");
		bd.append("\t");
		
		bd.append("ong nam");
		System.out.println(bd.toString());
		
		bd.insert(6, "dep trai ");
		System.out.println(bd.toString());
	}
}
