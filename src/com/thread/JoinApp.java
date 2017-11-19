package com.thread;

import org.omg.CORBA.PRIVATE_MEMBER;

public class JoinApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		new JoinThread("新线程").start();
		
		int i=0;
		
		for(;i<100;i++) {
			
			if(i==20) {
				
				JoinThread joinThread=new JoinThread("被join的线程");
				joinThread.start();
				joinThread.join();
				
			}
			
			System.out.println(i);
		}
	}

}
