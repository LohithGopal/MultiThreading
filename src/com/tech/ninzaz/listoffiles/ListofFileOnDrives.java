package com.tech.ninzaz.listoffiles;

public class ListofFileOnDrives {

	public static void main(String[] args) {

		FileLister fileLister = new FileLister("C:\\");
		Thread t1 = new Thread(fileLister);
		
		
		FileLister fileLister2 = new FileLister("D:\\");
		Thread t2 = new Thread(fileLister2);
		
		
		t1.start();
		//t2.start();
		
		
		
		
	}

}
