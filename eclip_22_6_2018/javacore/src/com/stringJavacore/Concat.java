package com.stringJavacore;

public class Concat {

	public static void main(String[] args) {
		// trong String concat dung de noi chuoi
		String s1="java string";  
		s1=s1.concat(" is immutable");  
		System.out.println(s1);  
		s1=s1.concat(" is immutable so assign it explicitly");  
		System.out.println(s1); 
		String s2;
		s2=s1.concat(" pham van trong");
		System.out.println(s2);
		
	}
}
