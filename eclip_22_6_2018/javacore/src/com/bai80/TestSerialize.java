package com.bai80;

import java.util.ArrayList;
import java.util.Scanner;

public class TestSerialize {

	static ArrayList<BaiTapSerializeDanhBa>dsDB= new ArrayList<>();
	public static void menu() {

		System.out.println("1.nhap");
		System.out.println("2.xuat");
		System.out.println("3.luu");
		System.out.println("4.doc");
		System.out.println("5.thoat");
		System.out.println("moi ban chon");
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
			doc();
			break;
		case 5:
			System.err.println("cam on ban da su dung phan mem cua chung toi");
			System.exit(0);
			break;
		default:
			break;
		}
	}
	private static void doc() {
		dsDB=BaiTapSerializeFactory.readFile("D:/dulieuDB.txt");
		xuat();
		
	}
	private static void luu() {
		boolean kt=BaiTapSerializeFactory.saveFile(dsDB,"D:/dulieuDB.txt");
		if(kt) {
			System.out.println("ok");
		}else {
			System.out.println("no ok");
		}
	}
	private static void xuat() {
	System.out.println("danh ba");
	for (BaiTapSerializeDanhBa db :dsDB) {
		System.out.println(db);
	}
		
	}
	private static void nhap() {
		// TODO Auto-generated method stub
		System.out.println("nhap ten");
		String ten = new Scanner(System.in).nextLine();
		System.out.println("nhap phone");
		String phone= new Scanner(System.in).nextLine();
		BaiTapSerializeDanhBa db = new BaiTapSerializeDanhBa(ten,phone);
		dsDB.add(db);
	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}
}
