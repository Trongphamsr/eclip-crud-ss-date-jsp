package com.bai48;

import java.util.Scanner;

public class TimKiemMang {

	public static void NhapMang(int M[]) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<M.length;i++) {
			System.out.println("M["+i+"]=");
			M[i]=sc.nextInt();
		}
	}
	public static void XuatMang(int M[]) {
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i]+"\t");
		}
	}
	
	public static void TimPhanTu(int M[], int k) {
		boolean timThay=false;
		for (int i = 0; i < M.length; i++) {
			if(M[i]==k) {
				timThay=true;
				break;
			}
		}
		if(timThay==true) {
			System.out.println("tim thay "+k+ " trong mang");
		}else {
			System.out.println("khong tim thay "+k+" trong mang");
		}
	}
	
	public static void TimSoLanXuatHien(int M[], int k) {
		String s="";
		int soLan=0;
		
		for (int i = 0; i < M.length; i++) {
			if(M[i]==k) {
				s+=i+";";
				soLan++;
			}
		}
		if(s.length()>0) {
			System.out.println("tim thay "+k+ " xuat hien "+soLan+" lan");
			System.out.println("cac vi tri nay la");
			System.out.println(s);
		}else {
			System.out.println("khong tim thay "+k);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" moi ban nhap so phan tu cua mang");
		int n = sc.nextInt();
		int []M= new int[n];
		System.out.println("moi ban nhap gia tri cua mang");
		NhapMang(M);
		System.out.println("mang sau khi nhap la");
		XuatMang(M);
		System.out.println("moi ban nhap so muon tim");
		int k =sc.nextInt();
		TimPhanTu(M, k);
		System.out.println("moi ban nhap so khac de tim");
		int x= sc.nextInt();
		TimSoLanXuatHien(M, x);
	}
}
