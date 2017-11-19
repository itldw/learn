package com.thread;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class PriorityApp {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	     PriorityThread priorityThread=new PriorityThread("ตอ");
	     priorityThread.setPriority(Thread.MIN_PRIORITY);
	     priorityThread.start();
	     
	     PriorityThread priorityThread2=new PriorityThread("ธ฿");
	     priorityThread2.setPriority(Thread.MAX_PRIORITY);
	     priorityThread2.start();
	    
	}

	
}
