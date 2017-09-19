package world;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;


import stages.Intro;
import startPack.Start;

public class Demo {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 2; i++) {
			Start.register();
		}
		System.out.println("+++++++++++++++++++++");
		while (true) {
			Start.logIn();
		}
		
		
	}
}
