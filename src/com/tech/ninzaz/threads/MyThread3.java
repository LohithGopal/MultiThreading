package com.tech.ninzaz.threads;

public class MyThread3 extends Thread {

	public void run(){
		System.out.println("NO Arg RUN Method");
	}
	
	public void run(int i){
		System.out.println("Arg RUN Method");
	}

	
	public void start(int i){
		System.out.println("Inside Start method with Arguments");
	}
}
