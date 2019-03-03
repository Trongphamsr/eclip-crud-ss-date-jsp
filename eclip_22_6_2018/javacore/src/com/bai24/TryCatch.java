package com.bai24;

public class TryCatch {
	/**
	 * co loi dung try cath thi truong trinh van tiep tuc chay
	 * @param args
	 */
	

	public static void main(String[] args) {
		try {
			int x=5;
			int y=5/10;
			
		
			
			System.out.println("x "+x);
			System.out.println("z "+y);
			
			int z=x/y;
			System.out.println(z);
			
		} catch (Exception e) {
			System.out.println("co loi ");
			e.printStackTrace();
		}
		System.out.println(" cam on ban");
	}
}
