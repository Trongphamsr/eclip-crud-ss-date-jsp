package com.bai80;

import java.util.ArrayList;

public class TestFile {

//	public static void main(String[] args) {
//		ArrayList<String> dsData = new ArrayList<>();
//		dsData.add("a");
//		dsData.add("c");
//		dsData.add("d");
//		dsData.add("b");
//		
//		boolean kq= XuLyTapTinvsTextFile.luuFile(dsData, "D:/dulieutest.txt");
//		if(kq==true) {
//			System.out.println("ok");
//		}else {
//			System.out.println("no ok");
//		}
//	}
	
	
	public static void main(String[] args) {
		ArrayList<String> dsData= XuLyTapTinvsTextFile.docFile("D:/dulieutest.txt");
		for(String data:dsData) {
			System.out.println(data);
		}
	}
}
