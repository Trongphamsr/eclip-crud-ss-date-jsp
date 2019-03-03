package communityutil.com;

import java.util.Scanner;

public class ICauTrufElse {
	public static void main(String[] args) {
		System.out.println("moi ban nhap du lieu tu ban phim");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		if(a>0) {
			System.out.println("ban nhap gia tri duong");
		}else {
			System.out.println("ban nhap gia tri am");
		}
		System.out.println("moi ban nhap chuoi tu ban phim");
		String s = new Scanner(System.in).nextLine();
		System.out.println("chuoi ban nhap tu ban phim la: " +s);
		System.out.println(" ban hay nhap mot so nguyen");
		int soNguyen= sc.nextInt();
		System.out.println((soNguyen%2==0)?"so chan":"so le");
	}
}
