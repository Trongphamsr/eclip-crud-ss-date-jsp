package com.bai24;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class DinhDangSo {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("nhap diem toan");
//		double a = sc.nextDouble();
//		
//		System.out.println("nhap diem ly");
//		double b = sc.nextDouble();
//		
//		System.out.println("nhap diem hoa");
//		double c = sc.nextDouble();
//		
//		double d =(a+b+c)/3;
//		System.out.println(d);
//		
//		DecimalFormat ft = new DecimalFormat("#.##");
//		System.out.println(ft.format(d));
		
		
		int x =123456654;
		DecimalFormat df=new DecimalFormat("#,###");
		DecimalFormatSymbols dcfs =  new DecimalFormatSymbols(Locale.getDefault());
		dcfs.setGroupingSeparator('.');
		df.setDecimalFormatSymbols(dcfs);
		System.out.println(df.format(x));
	}
}
