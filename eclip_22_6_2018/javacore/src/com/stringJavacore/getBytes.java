package com.stringJavacore;

public class getBytes {

	public static void main(String[] args) {
//		getBytes(String charsetName): Mã hóa String này thành dãy các byte liên tục bởi sử dụng bộ ký tự (charset) mặc định của platform, lưu giữ kết quả vào trong một mảng byte mới.
//		getBytes(): Mã hóa String này thành dãy các byte liên tục bởi sử dụng bộ ký tự (charset) mặc định của platform, lưu giữ kết quả vào trong một mảng byte mới.
		String s1="abdefghij";  
		
		byte[] barr=s1.getBytes();  
		
		for(int i=0;i<barr.length;i++){  
			System.out.println(barr[i]);
		}
	}
}
