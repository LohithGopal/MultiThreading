package com.tech.ninzaz.threadcommunication;

import java.util.Scanner;

public class Processor {
	
	public void workOne() throws InterruptedException{
		synchronized (this) {
			System.out.println("Producer Thread Running .....");
			wait();
			System.out.println("Producer Resumed");
		}
		
	}
	
	
	public void workTwo() throws InterruptedException{
		
		Thread.sleep(2000);
		Scanner sc = new Scanner(System.in);
				
		synchronized (this) {
			System.out.println("Waiting for Return Key .....");
			sc.nextLine();
			System.out.println("Return Key Pressed");
			notify();
		}
		
	}

}
