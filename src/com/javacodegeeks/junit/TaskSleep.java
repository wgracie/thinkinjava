package com.javacodegeeks.junit;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskSleep implements Runnable {
	private int sleeptime;
	public TaskSleep() {
		this.sleeptime = new Random().nextInt(10);
	}
	
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(sleeptime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sleeped time :" + sleeptime);
	}
	


	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new TaskSleep());
		}
		exec.shutdown();

	}

}
