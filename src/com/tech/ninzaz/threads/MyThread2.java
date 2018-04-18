package com.tech.ninzaz.threads;

public class MyThread2 extends Thread {

	
	public void run(){
		for (int i = 0; i < 10; i++) {			
			System.out.println("Extends Thread: Inside Child Thread");
		}
	}
	
	//Overriding of the start method
	public void start(){
		super.start();
		System.out.println("Start Thread Method");
	}
	
}
