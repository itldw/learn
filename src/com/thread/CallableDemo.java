package com.thread;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer>{

	private int i;
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		for(;i<100;i++) {
			
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
		return i;
	}

}
