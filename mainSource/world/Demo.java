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
import stages.Stage;
import startPack.Start;
import users.User;
import utilities.Utility;

public class Demo {

	public static void main(String[] args) throws Exception {
		System.out.println("LoginScreen");
		System.out.println("Type:");
		System.out.println("L - For Logging in!");
		System.out.println("R - For Registration!");
		System.out.println("F - For Forgotten Password");
		char input = Utility.SCAN.next().charAt(0);
		User currentUser = null;
		while(input != 'L' && input != 'R' && input != 'F') {
			System.out.println("Incorrect selection, try again:");
			input = Utility.SCAN.next().charAt(0);
		}
		Utility.SCAN.nextLine();
		switch (input) {
		case 'L':
			System.out.println("Login Screen");
			currentUser = Start.logIn();
			break;
		case 'R':
			System.out.println("Register Screen");
			currentUser = Start.register();
			break;
		case 'F':
			System.out.println("Forgotten Password");
			currentUser = Start.forgottenPassword();
			break;
		default:
			break;
		}
		currentUser.showProffile();
		currentUser.attendStage();
	}
}
