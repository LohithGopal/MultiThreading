package com.tech.ninzaz.threadcommunication;

public class WaitAndNotifyEx {

	public static Processor processor = new Processor();
	
	public static void main(String[] args) {

		Thread t1 = new Thread(){
			public void run(){
				try {
					processor.workOne();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				try {
					processor.workTwo();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		t1.start();
		t2.start();
		
		
	}

}
