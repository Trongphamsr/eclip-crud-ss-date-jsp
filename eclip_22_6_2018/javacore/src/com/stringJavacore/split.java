package com.stringJavacore;

public class split {

	public static void main(String[] args) {
		
		String s1="java string split method by javatpoint";  
		String[] words=s1.split(" ");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}  
		System.out.println("---------");
		String[] word=s1.split("s");
		for(String w1:word){  
			System.out.println(w1);  
			} 
	}
}
