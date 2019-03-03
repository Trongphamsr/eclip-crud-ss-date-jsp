package communityutil.com;

import java.util.Scanner;

public class BaiTapFor {

	public static double TinhS(int x,int n) {
		double s=0;
		double mau=0;
		for(int i=1;i<=n;i++) {
			double tu=Math.pow(x, i);
			mau=mau+i;
			s=s+tu/mau;
			
		}
		System.out.println(s);
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap x");
		int x = sc.nextInt();
		System.out.println("nhap b");
		int n = sc.nextInt();
		double s =TinhS(x, n);
		System.out.println("S(" +x+ "," +n+ ")="+s);
	}	
}
