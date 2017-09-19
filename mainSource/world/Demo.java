package world;

import startPack.Start;

public class Demo {

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			Start.register();
		}
		System.out.println("+++++++++++++++++++++");
		while (true) {
			Start.logIn();
		}
		
	}
}
