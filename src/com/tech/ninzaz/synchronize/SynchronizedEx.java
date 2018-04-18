package com.tech.ninzaz.synchronize;

public class SynchronizedEx {
	
	/*
	 * Lohith Gopal
	 * 
	 * Volatile as well does not help much since the value is accessible by both the Threads.
	 * Synchronized methods make sure only one threads can access at a time. By Holding Intrinsic Lock.
	 * */
	
	private int count;
	
	public synchronized void increment(){
		count++;
	}
	
	public static void main(String[] args) {
		
	SynchronizedEx s = new SynchronizedEx();
	try {
		s.doWork();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	}
		
	public void doWork() throws InterruptedException{
		
		Thread t1 = new Thread(){
			public void run(){
				for (int i = 0; i <10000; i++) {
					//count++;
					increment();
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				for (int i = 0; i <10000; i++) {
					//count++;
					increment();
				}
			}
		};
	
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	
		System.out.println("Count is: "+ count);
		
	}

}
