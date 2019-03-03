package com.bai48;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class BaiTapArrayList {

	static ArrayList<Integer> dsData= new ArrayList<Integer>();
	
	public static void menu() {
		System.out.println("1.them");
		System.out.println("2.xuat");
		System.out.println("3.sua");
		System.out.println("4.xoa");
		System.out.println("5.tim kiem");
		System.out.println("6.sap xep");
		System.out.println("7.thoat");
		System.out.println("thim chon j");
		int chon= new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			them();
			break;
		case 2:
			xuat();
			break;
		case 3:
			sua();
			break;
		case 4:
			xoa();
			break;
		case 5:
			timKiem();
			break;
		case 6:
			sapXep();
			break;
		case 7:
			System.err.println("cam on thim");
			System.exit(0);
			break;
		default:
			break;
		}
	}
	private static void sapXep() {
		Collections.sort(dsData);
	}
	
	private static void timKiem() {
		System.out.println("ban muon tim so nao");
		int k = new Scanner(System.in).nextInt();
		if(dsData.contains(k)) {
			System.out.println("co"+k+ " trong danh sach");
		}else {
			System.out.println("khong co "+k+" trong danh sach");
		}
		
	}
	private static void xoa() {
		System.out.println("thim muon xoa vi tri nao");
		int vt=new Scanner(System.in).nextInt();
		dsData.remove(vt);
		
	}
	private static void sua() {
		System.out.println("vi tri muon sua");
		int vt = new Scanner(System.in).nextInt();
		System.out.println("gia tri moi");
		int value = new Scanner(System.in).nextInt();
		dsData.set(vt, value);
		
	}
	private static void xuat() {
		for (int i = 0; i < dsData.size(); i++) {
			System.out.print(dsData.get(i)+"\t");
		}
		System.out.println();
	}
	private static void them() {
		System.out.println("nhap ga tri muon them");
		int value= new Scanner(System.in).nextInt();
		dsData.add(value);
		
	}
	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}
}