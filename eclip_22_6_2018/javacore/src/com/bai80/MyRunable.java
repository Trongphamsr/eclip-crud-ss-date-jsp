package com.bai80;

public class MyRunable implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+" , i "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
