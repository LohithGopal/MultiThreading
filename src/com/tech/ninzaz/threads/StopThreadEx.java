package com.tech.ninzaz.threads;

import java.util.Scanner;

class Processor extends Thread {
	/*
	 * volatile means shared between all the threads.
	 * Prevents Caching by each of the Threads.
	 * */
	
	public static volatile boolean running = true;
	
	public void run(){
		while(running){
			System.out.println("Hello");
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void shutDown(){
		running=false;
	}
	
}

public class StopThreadEx {

	public static void main(String[] args) {
	
		Processor proc1 = new Processor();
		proc1.start();
		
		Processor proc2 = new Processor();
		proc2.start();
		

		
		System.out.println("Press return to stop the thread .....");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		proc1.shutDown();
		
	}

}
