package users;

import java.util.ArrayList;

import stages.Intro;
import stages.Stage;

public class User implements Comparable<User>{

	private String username;
	private String password;
	private String email;
	private int points;
	private static int statID = 1;
	private int currentID;
	private Stage CurrentStage;
	
	private ArrayList<Stage> availableStages = new ArrayList<>();
	
	
	
	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.currentID = statID++;
		//Default points(StartValue)
		this.points = 10;
		//Default Stage,(StartStage)
		this.CurrentStage = new Intro();
		availableStages.add(CurrentStage);
	}



	@Override
	public int compareTo(User o) {
		return o.currentID - o.currentID;
	}



	public void showProffile() {
		System.out.println("\tUsername : " + this.username);
		System.out.println("Current Stage : " + this.CurrentStage.toString());
		System.out.println("Points : " + this.points);
		System.out.println("E-mail : " + this.email);
	}



	public void attendStage() {
		this.CurrentStage.showPage();
	}

}
