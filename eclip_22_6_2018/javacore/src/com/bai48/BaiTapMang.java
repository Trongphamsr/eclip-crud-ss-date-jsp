package com.bai48;

import java.util.Random;
import java.util.Scanner;

import communityutil.com.NhapBanPhamScanner;

public class BaiTapMang {
	static int []M;
	public static void menu() {
		System.out.println("1. nhap mang");
		System.out.println("2. xuat mang");
		System.out.println("3. tong mang");
		System.out.println("4. tim kiem");
		System.out.println("5. lon nhat");
		System.out.println("6. nho nhat");
		System.out.println("7. so nguyen to");
		System.out.println("8. tang dan");
		System.out.println("9. giam dan");
		System.out.println("-1. thoat");
		System.out.println("thim muon gi");
		int chon=new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			nhapMang();
			break;
		case 2:
			xuatMang();
			break;
		case 3:
			tinhTong();
			break;
		case 4:
			timKiem();
			break;
		case 5:
			timMax();
			break;
		case 6:
			timMin();
			break;
		case 7:
			soNguyenTo();
			break;
		case 8:
			sapTangDan();
			break;
		case 9:
			sapGiamDan();
			break;
		case -1:
			System.err.println("cam on ban da dung phan mem cua chung toi");
			System.exit(0);
		default:
			break;
		}
	}
	private static void sapGiamDan() {
		for (int i = 0; i < M.length; i++) {
			for (int j = i+1; j < M.length; j++) {
				if(M[i]<M[j]) {
					int tam=M[i];
					M[i]=M[j];
					M[j]=tam;
				}
			}
		}
		
	}
	private static void sapTangDan() {
		for (int i = 0; i < M.length; i++) {
			for (int j = i+1; j < M.length; j++) {
				if(M[i]>M[j]) {
					int tam=M[i];
					M[i]=M[j];
					M[j]=tam;
				}
			}
		}
		
	}
	private static void soNguyenTo() {
		// chia het cho 1 va chinh no
		System.out.println("so nguyen to");
		for (int i = 0; i < M.length; i++) {
			int dem=0;
			for (int j = 1; j < M[i]; j++) {
				if(M[i]%j==0)
					dem++;
			}
			if(dem==2)
				System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	private static void timMin() {
		int min=M[0];
		for (int i = 1; i < M.length; i++) {
			if(M[i]<min)
				min=M[i];
		}
		System.out.println("so nho nhat "+min);
		
	}
	private static void timMax() {
		// coi phan tu dau tien max mang di ss neu so tiep theo lon hon ta gan nguoc lai cho gia tri max
		int max=M[0];
		for (int i = 1; i < M.length; i++) {
			if(M[i]>max)
				max=M[i];
		}
		System.out.println("so lon nhat "+max);
		
	}
	private static void timKiem() {
		int soLan=0;
		String s="";
		System.out.println("thim muon tim so gi");
		int k = new Scanner(System.in).nextInt();
		for (int i = 0; i < M.length; i++) {
			if(M[i]==k) {
				soLan++;
				s+=i+"";
			}
		}
		if(soLan==0) {
			System.out.println("khong thay "+k+" trong mang");
		}else {
			System.out.println("thay "+k+" trong mang");
			System.out.println("cac vi tri tim thay");
			System.out.println(s);
		}
	}
	private static void tinhTong() {
		int sum=0;
		for (int x:M) {
			sum+=x;
		}
		System.out.println("tong mang= "+sum);
	}
	private static void xuatMang() {
		System.out.println("cac phan tu trong mang");
		for (int i = 0; i < M.length; i++) 
			System.out.print(M[i]+"\t");
			System.out.println();
	}
	private static void nhapMang() {
		System.out.println("moi ban nhap mang");
		int n = new Scanner(System.in).nextInt();
		M=new int[n];
		Random rd = new Random();
		for (int i = 0; i <n; i++) {
			M[i]=rd.nextInt(100);
		}
	}
	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}
}
