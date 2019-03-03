package com.stringJavacore;

public class indexOf {

	public static void main(String[] args) {
		String s1="h is hh this is index of example";  
		
		int index1=s1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"  "+index2);//2 8  
		
		int indext5 =s1.indexOf("of");
		System.out.println("indext5= "+indext5);
		int t = s1.indexOf("example");
		System.out.println("t= "+t);
		//passing substring with from index  
		System.out.println("------------");
		int index3=s1.indexOf("is",17);//returns the index of is substring after 4th index  
		System.out.println(index3);//5 i.e. the index of another is  
		
		System.out.println("------------");
		//passing char value  
		int index4=s1.indexOf('s');//returns the index of s char value  
		System.out.println(index4);//3  
	}
}
