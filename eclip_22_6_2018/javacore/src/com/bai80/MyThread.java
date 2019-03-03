package com.bai80;

public class MyThread extends Thread{

	// da tien trinh chay gan nhu song song rat khoa xua loi, moi lan chay khac nhau
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 10; i++) {
				// 1000 ->1s
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+"i: "+i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
