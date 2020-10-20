package be.pxl.ja.streamingservice.util;

public class PasswordUtil {

	private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";
	private static final String NUMBERS = "1234567890";
	private static final String LETTERS = "azertyuiopqsdfghjklmwxcvbn";

	public static int calculateStrength(String password) {
		int passwordStrength = 0;
		if (password.length() >= 6 && password.length() < 10){
			passwordStrength = 1;
		}
		else if (password.length() >= 10){
			passwordStrength = 2;
		}
		if (passwordStrength > 0){
			boolean breakloop = false;
			for (char c : NUMBERS.toCharArray()){
				for (char p : password.toCharArray()){
					if (c == p){
						passwordStrength += 2;
						breakloop = true;
					}
				}
				if (breakloop){
					break;
				}
			}
			for (char c : LETTERS.toCharArray()){
				breakloop = false;
				for (char p : password.toCharArray()){
					if (c == p){
						passwordStrength += 2;
						breakloop = true;
					}
				}
				if (breakloop){
					break;
				}
			}
			for (char c : LETTERS.toUpperCase().toCharArray()){
				breakloop = false;
				for (char p : password.toCharArray()){
					if (c == p){
						passwordStrength += 2;
						breakloop = true;
					}
				}
				if (breakloop){
					break;
				}
			}
			for (char c : SPECIAL_CHARACTERS.toCharArray()){
				breakloop = false;
				for (char p : password.toCharArray()){
					if (c == p){
						passwordStrength += 2;
						breakloop = true;
					}
				}
				if (breakloop){
					break;
				}
			}
		}
		return passwordStrength;
	}
}
