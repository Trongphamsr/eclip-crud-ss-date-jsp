package com.bai24;

import java.util.StringTokenizer;

public class HamTimChuoi {
	public static void main(String[] args) {
		String s = "Hello everybody";
		int i=0;
//		indexOf tim chuoi dau tien tra ve(vi tri vi du trong day tra ve vi tri 1), neu sai tra ve -1
		i=s.indexOf("e");
		System.out.println(i);
		
		
		int i1=0;
//		indexOf tim chuoi cuoi  tra ve(vi tri vi du trong day tra ve vi tri 8), neu sai tra ve -1
		i1=s.lastIndexOf("e");
		System.out.println(i);
		System.out.println(i1);
		
		
		String st = "anh hop que hai duong anh ay rat dep trai anh ay cung rat tot";
		int vt1=st.indexOf("hop");
		
		if(vt1==-1) {
			System.out.println("khong thay");
		}else {
			System.out.println("thay vi tri "+vt1);
		}
		
		int vt2=st.indexOf("noi");
		if(vt2==-1) 
			System.out.println("khong thay");
		else
			System.out.println("tim thay");
		
		int vt3=st.lastIndexOf("duong");
		if(vt3==-1) 
			System.out.println("khong thay");
		else
			System.out.println("tim thay "+vt3);
		
		System.out.println("-------------------");
		
		if(st.contains("hop")==true) {
			System.out.println("co trong chuoi");
		}else {
			System.out.println("khong co trong chuoi");
		}
		
		if(st.contains("nam")==true) {
			System.out.println("co trong chuoi");
		}else {
			System.out.println("khong co trong chuoi");
		}
		
		StringTokenizer  token = new StringTokenizer(st);
		int dem=0;
		while(token.hasMoreTokens()) {
			String value = token.nextToken();
			if(value.contains("anh")) {
				dem++;
			}
		}
		System.out.println(" tim thay "+dem+" tu anh");
		String name="javatpoint";  
		char ch=name.charAt(0);//returns the char value at the 10th index  
		System.out.println(ch);  
	}
}
