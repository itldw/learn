package com.thread;

public class PriorityThread extends Thread {

	
	private int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for( i=0;i<100;i++) {
			
			System.out.println(getName()+" "+i);
		}
	}
	
	public  PriorityThread(String name) {
		super(name);
	}

}
