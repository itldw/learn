package com.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableApp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		
		CallableDemo callableDemo=new CallableDemo();
		FutureTask<Integer> task=new FutureTask<Integer>(callableDemo);
		
	    new	Thread(task,"第一个线程").start();
	   
	    System.out.println("线程返回值"+task.get());
	    
	}

}
