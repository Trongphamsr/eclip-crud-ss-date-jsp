package test.java.fpt;

public class bai8_10 {

	public static void main(String[] args) {
		int a=22;
		String b=(a<15)?"tity":(a<22)?"smail":"9";
		System.out.println(b);
		
//		bai10
		int i=2017;
		do {
			while (i>20) {
				i-=2000;
			}
		} while (i>2017);
		System.out.println(i);
		
		
//		bai9
		
//		int i=1,j=5;
//		for (int i,j;(i<3)&&(j++<10);i++) {
//			System.out.println(i+ "  " +j);
//		}
//		System.out.println(i+ "  " +j);
	}
}
