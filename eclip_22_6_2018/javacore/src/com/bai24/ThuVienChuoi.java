package com.bai24;

import java.util.StringTokenizer;

public class ThuVienChuoi {

	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(" ");
		sb.append("putin");
		sb.append(" ");
		sb.append("opama");
		sb.insert(5, "xxx");
		String s = sb.toString();
		System.out.println(s);
		sb.delete(1,2);
		s = sb.toString();
//		String s1 = sb.toString();
		System.out.println(s);
		s=sb.reverse().toString();
		System.out.println(s);
		
		
		String s1="javatpoint is a very good website";  
		String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(s1);  
		System.out.println(replaceString);  
		
		
		
		String st = "Obama Putin Un";
		StringTokenizer token1 = new StringTokenizer(st);
		while (token1.hasMoreTokens()) {
			String value = token1.nextToken();
			System.out.println(value);
		}
		
		String st2 = "Obama;Putin;Kim Jong Un!ong hop";
		StringTokenizer token2 = new StringTokenizer(st2, ";!");
		while (token2.hasMoreTokens()) {
			String value1 = token2.nextToken();
			System.out.println(value1);
		}
	}
}
