package com.tech.ninzaz.chatbot;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	BlockingQueue<String> que;
	
	public Producer(BlockingQueue<String> que){
		this.que = que;
	}

	@Override
	public void run() {
	
		while(true){
			Scanner sc = new Scanner(System.in);
			String line= sc.nextLine();
			que.add(line);
			System.out.println("PRODUCER: "+ line);
		}
		
	}

}
