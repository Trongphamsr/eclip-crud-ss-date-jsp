package com.bai80;

public class TestRunable {

	public static void main(String[] args) {
		MyRunable run1 = new MyRunable();
		MyRunable run2 = new MyRunable();
		MyRunable run3 = new MyRunable();
		Thread th1 = new Thread(run1);
		th1.setName("tien trinh a");
		Thread th2 = new Thread(run2);
		th2.setName("tien trinh b");
		Thread th3 = new Thread(run3);
		th3.setName("tien trinh c");
		th1.start();
		th2.start();
		th3.start();
	}
}
