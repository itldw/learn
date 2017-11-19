 package com.thread;

public class ThreadDemo  extends Thread{

	private int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(;i<100;i++) {
				System.out.println(getName()+" "+i);
		}
	}

	
	
}
