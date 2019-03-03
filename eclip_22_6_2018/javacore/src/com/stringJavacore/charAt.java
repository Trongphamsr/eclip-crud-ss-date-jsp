package com.stringJavacore;

public class charAt {

	public static void main(String[] args) {
		// neu ban muon tim den 1 vi tri trong chuoi dung charAt
		String name = "pham van trong";
		char ch = name.charAt(7);
		System.out.println(ch);
		
		 String str = "Welcome to Javatpoint portal";      
	    int strLength = str.length();      
	    // Fetching first character  
	    System.out.println("Character at 0 index is: "+ str.charAt(0));      
	    // The last Character is present at the string length-1 index  
	    System.out.println("Character at last index is: "+ str.charAt(strLength-1));     
	}
}
