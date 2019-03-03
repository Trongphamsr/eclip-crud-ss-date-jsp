package a;

import javax.management.RuntimeErrorException;

public class a {
	 
//	 public static void aMethod() throws Exception{
//		 try {
//			 throw new Exception();
//		 }finally {
//			 System.out.println("finnaly");
//		 }
//	 }
//	 
//	 public static void badMethod() {
//		 throw new RuntimeException();
//	 }
	 public static void main(String[] args) {
//		
//		 try {
//			 
//			 badMethod();
//			 System.out.println("a");
//		} catch (Exception e) {
//			System.out.println("b");
//		}finally 
//		 {
//			System.out.println("c");
//		}
//		 {
//			 System.out.println("d");
//		 }
		 
		 
//		 for (int i = 0; i < 20; i++) {
////		0 2 4 6 8 10 12 14 16 18
//			 
//			if(i++%3==0) {
//				continue;
//			}
//			System.out.print(" "+i);
//		}
		 
		 for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		 
		 
		 for (int x = 1; x <= 5; x++) {
				
			 for (int y = 1; y <= x; y++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		 
		 System.out.println();
		int number=5;
		
		 while(number>=1){
			 for (int i = 0; i < number; i++) {
				System.out.print("*");
			}
			 System.out.println(" ");
			 number--;
		 }
	}
}
 