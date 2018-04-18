package com.tech.ninzaz.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Processor implements Runnable {

	private int id;
	
	public Processor(int id){
		this.id = id;
	}


	public void run() {
		System.out.println("Starting: "+ id);
		//Simulate some work
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Completed: "+ id);
	}
	
	public static void main(String[] args){
	
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 5; i++) {
			executor.submit(new Processor(i));
		}
		
		executor.shutdown(); //Stop accepting new tasks
		
		System.out.println("All tasks Submitted succesfully");
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All Taks Completed");
	}


	
}
