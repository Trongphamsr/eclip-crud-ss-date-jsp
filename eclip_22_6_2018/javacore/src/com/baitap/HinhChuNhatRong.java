package com.baitap;

import java.util.Scanner;

public class HinhChuNhatRong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap hieu dai va chieu rong");
		int m,n;
		m=sc.nextInt();
		n=sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(i==0||i==1||i==m-1||j==0) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
