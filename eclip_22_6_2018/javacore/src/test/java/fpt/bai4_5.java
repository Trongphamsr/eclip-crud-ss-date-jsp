package test.java.fpt;

public class bai4_5 {

	public static void main(String[] args) {
		int []arr= {1,4,3,6,8,2,5};
		int wat=arr[0];
//		wat=1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>wat)
				wat=arr[i];
		}
		System.out.println(wat);
		
		
//		bai5
		
		System.out.println("----------------");
		System.out.println("a");
		int i=3;
		while (i-->0) {
			System.out.println("b");
			
		}
	}
}
