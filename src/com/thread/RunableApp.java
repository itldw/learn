package com.thread;

public class RunableApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunableDemo thread=new RunableDemo();
			
		new Thread(thread,"第一个线程").start();
		new Thread(thread,"第二个线程").start();
	}
}
