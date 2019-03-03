package test.java.fpt;

public class bai11_17 {

	public static void main(String[] args) {
//		int i=17;
//		do {
//			while (i<20) {
//				i+=2018;	
//			}
//		} while (i<2018);
//		System.out.println(i);
//		
//		
////		bai12
//		int in=5;
//		String[] str=new String[10];
//		String result=str[in];
//		System.out.println(result);
//		
//		
////		bai13
//		int a=40;
//		String name=a>100?"not":(a<50)?"anny":(a<30)?"audy":"davi";
//		System.out.println(name+ " "+a );
		
////		bai14
//		for (int j = 0; j < 10; j++) {
//			
//			if(j%3!=0) {
//				break;
//			}
//			System.out.println("ab");
//		}
		
		
//		bai15
		int number=0;
		System.out.println(number++ + ++number + ++number);
		
//		bai16
		String str="420";
		str.concat("42");
		System.out.println(str);
		
		
//		bai17
		int xy=5;
		boolean b1=true;
		boolean b2=false;
		if((xy==4)&&!b2)
			System.out.println("1");
			System.out.println("2");
		if((b2=true)&&b1)
			System.out.println("3");
		
	}
}
