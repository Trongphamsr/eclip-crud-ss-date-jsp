package com.bai24;

public class XoaKhoangTrangDuThuThuatraiphaiTrim {

	public static void main(String[] args) {
		String s= " thay pham van trong ";
		System.out.println(s);
		
		System.out.println("chieu dai= "+s.length());
		s=s.trim();
		System.out.println(s);
		System.out.println("chieu dai= "+s.length());
		
		
		String s1=" Obama an com trua voi putin ";
		int vtLeft=0;
		int i=0;
		for(i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(c==' ') 
				vtLeft=i;
			else
				break;
		}
		s1=s1.substring(i);
		System.out.println(s1);
		
		String s2=" Obama an com trua voi putin ";
		int vtRight=0;
		i=0;
		for(i=s2.length()-1;i>=0;i--) {
			char c=s2.charAt(i);
			if(c==' ')
				vtRight=i;
			else
				break;
		}
		s2=s2.substring(0, vtRight);
		System.out.println(s2);
	}
}
