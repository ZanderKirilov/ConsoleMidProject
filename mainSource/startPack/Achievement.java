package users;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeSet;

public class Achievement {
	public enum achievement {

		INTRO(1), CONDITIONSANDLOOPS(2), ARRAYS(3), METHODSANDRECURSION(4), STRING(5), ALGORITHMS(6);
		private int level;
		private achievement(int level) {
			this.level = level;
		}
	}
		private TreeSet<achievement> achs = new TreeSet<>();
		

		public void unlockAchievement(){
			if(stagePassed()){
				achs.add(achievement.INTRO);
				System.out.println(achs);
			}
		}

		public TreeSet<achievement> getAchs() {
			return achs;
		}

		public boolean stagePassed() {
			File testText = new File("E:\\GITHub\\ConsoleMidProject\\Intro.txt");

			FileInputStream testTextInput = null;
			try {
				testTextInput = new FileInputStream(testText);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}

			try {
				int testText1 = testTextInput.read();
				while (testText1 != -1) {
					testText1 = testTextInput.read();
					if(testText1 == -1){
						return true;
					}
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}

			return false;
		}
		
		
	

}
