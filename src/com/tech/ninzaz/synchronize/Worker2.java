package com.tech.ninzaz.synchronize;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker2 {

	/*
	 * Change this to Synchronized block and re-entrant lock
	 * */
	
	
	Random random = new Random();
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	private Object lock1= new Object();
	private Object lock2= new Object();
	
	public void stageOne(){
		synchronized (lock1) {
			
		
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list1.add(random.nextInt());
		}
	}
	
	public void stageTwo(){
		
		synchronized (lock2) {
			
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list2.add(random.nextInt());
		}
	}
	
	public void process(){
		for (int i = 0; i <1000; i++) {
			stageOne();
			stageTwo();
		}
	}
	
	public void main() {
	/*
	 * Create 2 threads here and make them synchornized then it takes 4s which is double the time taken 
	 * Try Running before making the methods are Synchronized, before join
	 * Intrinsic lock or Monitor lock.
	 * 
	 * */
	Long start = System.currentTimeMillis();	
	
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
		
	Long end = System.currentTimeMillis();
	
	System.out.println("Time Taken: "+ (end-start));
	System.out.println("List1 Size: " + list1.size() + " List2 Size: " + list2.size());
	}

}
