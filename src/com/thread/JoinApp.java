package com.thread;

import org.omg.CORBA.PRIVATE_MEMBER;

public class JoinApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		new JoinThread("���߳�").start();
		
		int i=0;
		
		for(;i<100;i++) {
			
			if(i==20) {
				
				JoinThread joinThread=new JoinThread("��join���߳�");
				joinThread.start();
				joinThread.join();
				
			}
			
			System.out.println(i);
		}
	}

}
