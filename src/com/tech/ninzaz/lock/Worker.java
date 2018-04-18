package com.tech.ninzaz.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

	Random random = new Random();
	private List<Integer> l1 = new ArrayList<Integer>();
	private List<Integer> l2 = new ArrayList<Integer>();
	
	Object lock1 = new Object();
	Object lock2 = new Object();
	
	
	/*
	 * 1. Add Synchronized and demo that it take double the time taken previously.
	 * 2. Synhronized code blocks !! and how it reduces the time taken.
	 * */
	public void stageOne(){
		synchronized(lock1){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		l1.add(random.nextInt(100));
		}
	}
	
	public void stageTwo(){
		synchronized (lock2) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		l2.add(random.nextInt(100));
		}
	}
	
	public void process(){
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}
	
	public void main(){
		System.out.println("Starting ........");
		Long startTime =System.currentTimeMillis();
		
		Thread t1 = new Thread(){
			public void run(){
				process();				
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				process();
			}
		};
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		Long endTime = System.currentTimeMillis();
		System.out.println("Time Taken: "+ (endTime - startTime));
		System.out.println("List 1 Size: "+ l1.size() + " List 2 size: "+ l2.size());
				
	}
	
}
