package communityutil.com;

import java.util.Scanner;

public class BieuThucSwichCace {

	public static void main(String[] args) {
		System.out.println("moi ban nhap vao thang");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
		case 3:
		case 5:
			System.out.println(a+"la thang co 31 ngay");
			System.out.println("ban hay nhap nam muon tim kiem");
			Scanner sc1 = new Scanner(System.in);
			int in = sc1.nextInt();
			if(in%2==0) {
				System.out.println("nam "+in+" la nam nhuan");
			}else {
				System.out.println("nam "+in+" khong phai la nam nhuan");
			}
			break;
			
		case 2:
		case 4:
		case 6:
			System.out.println("ban nhap thang co 28 ngay");
			break;	

		default:
			System.out.println("ban nhap sai thang");
			break;
		}
	}
}
