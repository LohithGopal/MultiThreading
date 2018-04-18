package com.tech.ninzaz.family;

public class FamilyEx {

	public static void main(String[] args) {
		
		System.out.println("Dad Started to Work");
		
		Kid kid = new Kid("Study");
		Kid kid2 = new Kid("Buy Veggies");
		Driver driver = new Driver("Banshankari");
		
		System.out.println("Dad Instructed kid to Study");
		Thread t1 = new Thread(kid);
		t1.setName("KID");
		
		t1.start();
		
		System.out.println("Dad Instructed driver to drive");
		Thread t2 = new Thread(driver);
		t2.setName("DRIVER");
		
		t2.start();
		
		System.out.println("Dad Instructed kid 2 to buy Veggies");
		Thread t3 = new Thread(kid2);
		t3.setName("KID");
		
		t3.start();
		
		MainThreadWorking();
		System.out.println("Dad Completed his Work");
		
	
	}

	public static void MainThreadWorking() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
