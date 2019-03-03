package com.baitap;

import java.util.Scanner;

public class HinhCNDac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
		System.out.println("nhap vao so hang va so cot");
		m = sc.nextInt();
		n=sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
