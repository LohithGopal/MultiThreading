package com.tech.ninzaz.chatbot;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	
	BlockingQueue<String> que;
	
	public Consumer(BlockingQueue<String> que){
		this.que = que;
	}

	@Override
	public void run() {
		
		while(true){
			try {
				Thread.sleep(100);
				String line = que.take();
				System.out.println("CONSUMER: " + line);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
