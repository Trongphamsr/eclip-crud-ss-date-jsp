package com.bai48;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SapXepMang {

	public static void nhapMang(int M[]) {
		Random rd = new Random();
		for (int i = 0; i < M.length; i++) {
			M[i] = rd.nextInt(100);
		}
	}
	
	public static void xuatMang(int M[]) {
		for (int i = 0; i < M.length; i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	
	// sap xep
	public static void BubbleSort(int []M) {
		int i,j;
		for ( i = 0; i < M.length-1; i++) {
			for (j = M.length-1;j>i;j --) {
				if(M[j]<M[j-1])
				{
					int temp=M[j];
					M[j]=M[j-1];
					M[j-1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi ban nhap so phan tu mang");
		int n=sc.nextInt();
		int M[]= new int[n];
		nhapMang(M);
		System.out.println("mang sau khi nhap ngau nhien");
		xuatMang(M);
//		BubbleSort(M);
		Arrays.sort(M);
		System.out.println("mang sau khi sap xep");
		xuatMang(M);
	}
}
