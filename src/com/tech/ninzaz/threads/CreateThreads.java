package com.tech.ninzaz.threads;

public class CreateThreads {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();


		MyRunnable runnable = new MyRunnable();
		Thread t2 = new Thread(runnable);
		
		Thread t3 = new Thread(){
			
			public void run(){
				for (int i = 0; i < 10; i++) {					
					System.out.println("Thread 3 " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};


		try {
			t1.start();
			t1.join();
			
			t2.start();
			t2.join();
			
			t3.start();
			t3.join();

		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("IN MAIN Thread");
		}

		
	}

}
