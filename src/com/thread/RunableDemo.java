package com.thread;

public class RunableDemo implements Runnable{

	private int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;i<100;i++) {
			
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
