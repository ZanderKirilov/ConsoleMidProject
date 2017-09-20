package utilities;

import java.util.Random;
import java.util.Scanner;

import stages.Algorithms;
import stages.Intro;
import stages.Stage;



public final class Utility {

	public static final Random RANDOM = new Random();
	public static final Scanner SCAN = new Scanner(System.in);
	
	public static String generateRandomString() {
		String [] randomWord = {"text","cafemachine","copier","ashtray","cupofjuice","cigarette","lighter",
				"dog","laptop","personalcomputer","keyboard","mousepad","mouse","door","glass","lamp","movie","television","horror",
				"sandals","shoes","cover","element","sound","wooden","shield","zombie","skype","meeting","refuse","defuse","relation","progress"};
		return randomWord[Utility.RANDOM.nextInt(randomWord.length)];
	}
	
	public static String generateSubTitle(String dependant) {
		String subTitle = "";
		if (dependant.equals("Intro")) {
			String [] introSubTitle = {"For The Book", "For the App and ITTalents", "Introduction", "Type of variables", "Variable Values", "More for Variables", "Special Signs", "Operations", "Console Get", "More Operations"};
			return introSubTitle[Utility.RANDOM.nextInt(introSubTitle.length)];
		}
		//TODO Add and the other stages!
		return null;
		
	}
}
