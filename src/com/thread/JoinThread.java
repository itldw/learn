package com.thread;

public class JoinThread extends Thread {

	public JoinThread(String name) {
		super(name);
	}

	private int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(;i<100;i++) {
			
			System.out.println(currentThread().getName()+" "+i);
		}
	}
	
	
}
