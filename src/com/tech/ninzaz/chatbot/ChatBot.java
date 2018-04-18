package com.tech.ninzaz.chatbot;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ChatBot {

	public static void main(String[] args) {
	
		BlockingQueue<String> que = new ArrayBlockingQueue<String>(10);
		
		Producer producer = new Producer(que);
		Thread producerThread = new Thread(producer);
		
		Consumer consumer = new Consumer(que);
		Thread consumerThread = new Thread(consumer);
		
		producerThread.start();
		consumerThread.start();
		
		
	}

}
