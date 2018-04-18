package com.tech.ninzaz.threads;

public class IllegalThreadStateEx {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.start();
		t1.start();
		
	}

}
