package startPack;

import java.util.HashMap;
import java.util.TreeMap;

import users.User;
import utilities.Utility;

public class Start {
	
	private static HashMap<String, TreeMap<User, String>> allUsers = new HashMap<>();
	
	

	public static User register() {
		System.out.println("Please enter username:");
		String username = Utility.SCAN.nextLine();
		
		while (allUsers.containsKey(username)) {
			System.out.println("This username is already at use, enter different one:");
			username = Utility.SCAN.nextLine();
		}
		
		System.out.println("Please enter password:");
		String password = Utility.SCAN.nextLine();
		System.out.println("Please enter your password again:");
		String passwordMatch = Utility.SCAN.nextLine();
		
		while (!isValid(password)) {
			System.out.println("This is not a valid password try again!");
			System.out.println("Enter Password:");
			password = Utility.SCAN.nextLine();
			System.out.println("Enter Password again:");
			passwordMatch = Utility.SCAN.nextLine();
		}
		
		while (!password.equals(passwordMatch)) {
			System.out.println("Your passwords does not match, please enter them again:");
			System.out.println("Enter Password:");
			password = Utility.SCAN.nextLine();
			System.out.println("Enter Password again:");
			passwordMatch = Utility.SCAN.nextLine();
		}
		
		System.out.println("Please enter your e-mail:");
		String email = Utility.SCAN.nextLine();
		while (!email.contains("@")) {
			System.out.println("Your e-mail is not valid enter a new one!");
			email = Utility.SCAN.nextLine();
		}
		
		User userObj = new User(username, password, email);
		allUsers.put(username, new TreeMap<>());
		allUsers.get(username).put(userObj, password);
		return userObj;
	}
	public static User logIn() {
		System.out.println("Please enter username:");
		String username = Utility.SCAN.nextLine();
		
		while (!allUsers.containsKey(username)) {
			System.out.println("This username is not valid, enter different one, or press R to register");
			username = Utility.SCAN.nextLine();
			if (username.equalsIgnoreCase("R")) {
				User newRegister = Start.register();
				return newRegister;
			}
		}

		System.out.println("Please enter password:");
		String password = Utility.SCAN.nextLine();
		boolean correctPass = false;
		for (int i = 0; i < 6; i++) {
			if (!password.equals(allUsers.get(username).entrySet().iterator().next().getValue())) {
				System.out.println("You have entered a wrong password!");
				System.out.println("Enter your password!");
				password = Utility.SCAN.nextLine();
				continue;
			}else {
				correctPass = true;
				break;
			}
		}
		if (correctPass) {
			return allUsers.get(username).firstKey();
		}else {
			System.out.println("Press [Enter] to register!");
			return Start.register();
		}
		
		
		
	}
	public static User forgottenPassword() {
		System.out.println("Your new pass is .....");
		return Start.logIn();
	}
	
	private static boolean isValid(String password) {
		String regSet = "^[a-zA-Z0-9_]*$";
	    return password.matches(regSet);
	}
	
	
}
