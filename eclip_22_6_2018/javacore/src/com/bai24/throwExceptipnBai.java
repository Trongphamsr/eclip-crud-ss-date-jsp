package com.bai24;

public class throwExceptipnBai {
	public static void func() throws Exception{
		try {
			
		} catch (Exception e) {
			// thow dung nem ra exception de ben thang chay no xu ly(vd o day la thang main) vd nhu o day l thang se su ly
			throw e;
		}
	}
	
	public static void main(String[] args) {
		try {
			func();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
