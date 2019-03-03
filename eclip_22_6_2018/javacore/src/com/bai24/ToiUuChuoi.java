package com.bai24;

public class ToiUuChuoi {

	public static String toiUU(String s) {
		String sToiUu=s;
		sToiUu=sToiUu.trim();
		
		String []arrWord=sToiUu.split(" ");
		sToiUu="";
		
		for(String word :arrWord) {
			String newWord=word.toLowerCase();
			if(newWord.length()>0) {
				newWord=newWord.replaceFirst(newWord.charAt(0)+"", 
						(newWord.charAt(0)+"").toUpperCase());
				
				sToiUu+=newWord+" ";
			}
		}
		return sToiUu.trim();
	}
	
	public static void main(String[] args) {
		String s="  Tran   duy thaNH  ";
		String sToiUuu=toiUU(s);
		System.out.println(sToiUuu);
	}
		
}
