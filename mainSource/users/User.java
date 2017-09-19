package users;

import stages.Stage;

public class User implements Comparable<User>{

	private String username;
	private String password;
	private String email;
	private static int statID = 1;
	private int currentID;
	private Stage CurrentStage;
	
	
	
	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.currentID = statID++;
	}



	@Override
	public int compareTo(User o) {
		return o.currentID - o.currentID;
	}

}
