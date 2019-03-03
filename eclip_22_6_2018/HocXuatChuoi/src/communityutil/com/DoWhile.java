package communityutil.com;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ban nhap so nguyen");
		int a =1;
		int gt =1;
		
		int b = sc.nextInt();
		do {
			gt=a*gt;
			a++;
			
		} while (a<=b);
		System.out.println(gt);
	}
}
