package com.tech.ninzaz.threads;

public class MyThread extends Thread {

	public void run(){
		for (int i = 0; i <=10; i++) {
			
			System.out.println("Extends Thread: Inside the Child Thread");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
