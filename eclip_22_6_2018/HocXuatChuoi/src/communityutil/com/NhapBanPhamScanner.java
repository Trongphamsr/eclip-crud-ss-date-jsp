package communityutil.com;

import java.util.Scanner;

public class NhapBanPhamScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ban nhap du lieu tu ban phim");
		int a= sc.nextInt();
		double db = sc.nextDouble();
		System.out.println("ban vua nhap "+a);
		System.out.println("ban hay nhap so");
		
		System.out.println("ban vua nhap"+db);
		System.out.println("moi ban nhap chuoi");
		String b = new Scanner(System.in).nextLine();
		System.out.println("ban nhap chuoi string " +b);
	}
}
