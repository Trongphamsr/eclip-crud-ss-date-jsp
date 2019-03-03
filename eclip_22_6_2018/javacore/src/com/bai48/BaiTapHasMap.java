package com.bai48;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaiTapHasMap {

	static HashMap<Integer, String> map = new HashMap<>();
	public static void menu() {
		System.out.println("1.them");
		System.out.println("2.xuat");
		System.out.println("3.sua");
		System.out.println("4.xoa");
		System.out.println("5.tim kiem");
		System.out.println("6.thoat");
		System.out.println("chon j di thim");
		int chon = new Scanner(System.in).nextInt();
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
			System.err.println("cam on thim da dung phan mem");
			System.exit(0);
			break;
		default:
			break;
		}
		
	}
	private static void timKiem() {
		System.out.println("nhap ten sach muon tim");
		String ten=new Scanner(System.in).nextLine();
		for (Map.Entry<Integer, String> item:map.entrySet()) {
			if(item.getValue().contains(ten)) {
				System.out.println(item.getKey()+"-"+item.getValue());
			}
		}
	}
	private static void xoa() {
		System.out.println("moi ban nhap ma muon xoa");
		int ma= new Scanner(System.in).nextInt();
		if(map.containsKey(ma)==false) {
			System.out.println("khong thay ma xoa");
		}else {
			map.remove(ma);
		}
	}
	private static void sua() {
		System.out.println("moi ban nhap ma muon sua");
		int ma=new Scanner(System.in).nextInt();
		if(map.containsKey(ma)==false) {
			System.out.println("ma "+ma+" khong ton tai");
		}else {
			System.out.println("nhap ten danh sach moi");
			String ten = new Scanner(System.in).nextLine();
			map.put(ma, ten);
		}
		
	}
	private static void xuat() {
		System.out.println("ma\tTen sach");
		for (Map.Entry<Integer, String> item :map.entrySet()) {
			System.out.println(item.getKey()+"\t"+item.getValue());
		}
	}
	private static void them() {
		System.out.println("nhap ma sach");
		int ma= new Scanner(System.in).nextInt();
		System.out.println("nhap ten sach");
		String ten = new Scanner(System.in).nextLine();
		if(map.containsKey(map)==false) {
			map.put(ma, ten);
		}
	}
	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}
}
