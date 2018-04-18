package com.tech.ninzaz.threads;

public class MyRunnable implements Runnable {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Implements Runnable: Inside the Child Thread");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
