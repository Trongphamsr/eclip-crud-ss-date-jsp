package communityutil.com;

import java.util.Scanner;

public class GiaiPTBac2 {

	public static void ptb2(double a,double b,double c) {
		if(a==0) {
			System.out.println(" phuong trinh bac mot");
			if(c==0 && b==0) {
				System.out.println("pt vo so nghiem");
			}
			else if(b==0) {
				System.out.println("pt vo nghiem");
			}
			else {
				System.out.println("nghiem cua pt la" + -c/b);
			}
		}
		else {
			double DELTA= b*b-4*a*c;
			if(DELTA < 0) {
				System.out.println("pt vo nghiem");
			}else if(DELTA ==0) {
				System.out.println("pt co ng kep "+ (-b/(2*a)));
			}else {
				System.out.println("puong tring co nghiem x1 = "+(-b-Math.sqrt(DELTA))/(2*a));
				System.out.println("puong tring co nghiem x2 = "+(-b+Math.sqrt(DELTA))/(2*a));
			}
		}
	}
	
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" nhap so a");
			double a = sc.nextDouble();
			System.out.println(" nhap so b");
			double b = sc.nextDouble();
			System.out.println(" nhap so c");
			double c = sc.nextDouble();
			ptb2(a, b, c);
			
			System.out.println("ban co muon tiep tuc khong (c/k)");
			String line = new Scanner(System.in).nextLine();
			if(line.equals("k")) {
				break;
			}
		}
	}
}
