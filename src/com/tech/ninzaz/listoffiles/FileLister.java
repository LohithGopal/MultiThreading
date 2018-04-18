package com.tech.ninzaz.listoffiles;

import java.io.File;

public class FileLister implements Runnable {
	
	private String drive;
	public FileLister(String drive){
		this.drive = drive;
	}

	@Override
	public void run() {
		File file = new File(this.drive);
		for ( String f : file.list()) {
		
			checkIfDirectory(f);
		}
		
	}

	public void checkIfDirectory(String f){
	File tf = new File(f);
	if(tf.isDirectory()){
		for (String tmpf: tf.list()){
			checkIfDirectory(tmpf);
		}
	}else{
		System.out.println(this.drive + f);
	}
	}
	
}
