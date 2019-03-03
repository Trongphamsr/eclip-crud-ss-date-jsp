package com.stringJavacore;

public class lastIndexOf {

	public static void main(String[] args) {
		// chuoi suat hien cuoi cung
		String s = "v ph v am van trong dep trai";
		int ix =s.lastIndexOf('v');
		System.out.println(ix);
		
		String s1="this is index of example index";//there are 2 's' characters in this sentence  
		int index1=s1.lastIndexOf('s');//returns last index of 's' char value  
		System.out.println(index1);//6  
		int h = s1.lastIndexOf("index");
		System.out.println(h);
	}
}
