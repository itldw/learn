package com.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableApp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		
		CallableDemo callableDemo=new CallableDemo();
		FutureTask<Integer> task=new FutureTask<Integer>(callableDemo);
		
	    new	Thread(task,"��һ���߳�").start();
	   
	    System.out.println("�̷߳���ֵ"+task.get());
	    
	}

}
