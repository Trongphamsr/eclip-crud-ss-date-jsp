package test.java.fpt;

public class bai1_3 {

	public static void main(String[] args) {
//		bai 1
		
		int x1=0;
		int x2=1;
		x1++;
//		x1=1;
		x1=x1*x2++;
//		x1=1
//		x2=2;
		System.out.println(x1-- + ++x1 + --x1);
//		1 + 1 +0
		System.out.println("--------");
		System.out.println(x1);
		System.out.println("--------");
		System.out.println(x2);
		System.out.println("--------");
		System.out.println(x1-- + ++x1 + --x1);
//		0 0 -1
		System.out.println(x1+x2);
//		1+1+0
		
//		bai 2
		int n =3;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
//		bai3
		int i=0;
		while (++i<3) {
			System.out.println("a");
			
		}
	}
}
