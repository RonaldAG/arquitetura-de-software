package singleton.client;

import singleton.thread.ThreadSingleton;

public class Client {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			ThreadSingleton thread = new ThreadSingleton();
			thread.start();
		}
	}

}
