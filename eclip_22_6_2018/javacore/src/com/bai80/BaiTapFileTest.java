package com.bai80;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BaiTapFileTest {

	static ArrayList<BaiTapFile> dsKH= new ArrayList<>();
	
	public static void menu() {
		System.out.println("1.nhap");
		System.out.println("2.xuat");
		System.out.println("3.luu");
		System.out.println("4.mo");
		System.out.println("5.thoat");
		System.out.println("ban muon j");
		int n = new Scanner(System.in).nextInt();
		switch (n) {
		case 1:
			nhap();
		    break;
		case 2:
			xuat();
		    break;
		case 3:
			luu();
		    break;
		case 4:
			mo();
		    break;
		case 5:
			System.err.println("cam on ban da sd phan mem");
			System.exit(0);
		    break;
		default:
			break;
		}
	}
	private static void mo() {
		// TODO Auto-generated method stub
		dsKH=BaiTapFileTextFileFactory.readFile("D://dulieukh.txt");
	}
	private static void luu() {
		// TODO Auto-generated method stub
		if(BaiTapFileTextFileFactory.saveFile(dsKH, "D://dulieukh.txt")==true) {
			System.out.println("ok");
		}
	}
	private static void xuat() {
		// TODO Auto-generated method stub
		for (BaiTapFile kh : dsKH) {
			System.out.println(kh);
		}
	}
	private static void nhap() {
		System.out.println("moi ban nhap mo");
		int ma = new Scanner(System.in).nextInt();
		System.out.println("moi ban nhap ten");
		String ten = new Scanner(System.in).nextLine();
		System.out.println("moi ban nhap nam(dd/mm/yyyy)");
		Date d = BaiTapFileDateConverter.fromString(new Scanner(System.in).nextLine());
		BaiTapFile kh = new BaiTapFile(ma,ten,d);
		dsKH.add(kh);
	}
	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}
}
