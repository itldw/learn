package com.thread;

public class RunableApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunableDemo thread=new RunableDemo();
			
		new Thread(thread,"��һ���߳�").start();
		new Thread(thread,"�ڶ����߳�").start();
	}
}
