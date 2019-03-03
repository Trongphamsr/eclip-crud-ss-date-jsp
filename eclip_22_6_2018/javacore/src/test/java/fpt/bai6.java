package test.java.fpt;

public class bai6 {

	public int a; public static int b;
//	a=b=0;
	public static void main(String[] args) {
		int cd;
		
		bai6 f1 = new bai6();
		bai6 f2 = new bai6();
		f1.a++;
//		1
		f1.b++;
//		1
		System.out.println(f1.a+" "+f1.b+" "+f2.a+ " "+f2.b);
		
	}
}
