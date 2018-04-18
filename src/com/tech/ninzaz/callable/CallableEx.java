package com.tech.ninzaz.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableEx {

	public static void main(String[] args) {
	
		Worker callableWorker = new Worker();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Future<Long> future=  executor.submit(callableWorker);
		
		executor.shutdown();
		
		try {
			executor.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		try {
			System.out.println("Time Taken is: "+ future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
