package com.tech.ninzaz.family;


public class Driver implements Runnable {

	private String location;
	public Driver(String location){
		this.location = location;
	}
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " Started to Driving to location: "+ location);
		for (int i = 0; i < 40; i++) {
			
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		System.out.println(Thread.currentThread().getName() + " Completed Driving to location: "+ location);
	}

}
