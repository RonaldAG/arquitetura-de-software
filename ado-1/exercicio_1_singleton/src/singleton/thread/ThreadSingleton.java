package singleton.thread;

import singleton.pattern.Singleton;

public class ThreadSingleton extends Thread{

	public void run() {
		Singleton singleton = Singleton.getInstance();
		System.out.println("Singleton hashcode:" + singleton.hashCode());
	}
}
