package com.bai48;

import java.util.Scanner;

public class TruyxuatThaoTacMang {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int []M;
		
		System.out.println("moi ban nhap so phan tu toi da");
		
		int n = sc.nextInt();
		M=new int[n];
		
		System.out.println("moi ban nhap gia tri cho mang");
		
		for(int i=0; i<M.length;i++) {
			System.out.println("M["+i+"]= ");
			M[i]=sc.nextInt();
		}
		System.out.println("mang sau khi nhap la");
		
		for(int i=0; i<M.length;i++) {
			System.out.print(M[i]+"\t");
		}
		
		System.out.println("--------------------");
	
		for(int i : M) {
			System.out.print(i+"\t");
		}
		
		int[] a= {1,2,4,5,6,7,4};
		System.out.println(a[3]);
		// duyet mang va lay ca chi so, vi tri...,
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		// chi don gian duyet for va xuat ra thi dung for arr
		for(int i :a ) {
			System.out.print(i);
		}
	}
}
