package com.tech.ninzaz.family;


public class Kid implements Runnable {
	
	private String work;
	public Kid(String work){
		this.work = work;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName()+ " is started to: " + work);
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(200 );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			System.out.println(Thread.currentThread().getName() + " Finished: " + work);
	}

}
