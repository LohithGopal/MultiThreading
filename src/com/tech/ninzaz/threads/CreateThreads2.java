package com.tech.ninzaz.threads;

public class CreateThreads2 {

	public static void main(String[] args) {
		
		MyThread2 t1 = new MyThread2();
		t1.start();
		
		//Overloading of run()
		MyThread3 t2 = new MyThread3();
		//t2.start();
		t2.start(10);

	}

}
