/* Zinnia Waheed
CIS 1068
Uppfora
Section5 5 */

import java.util.Scanner; 
import java.util.Random;



public class game {

	public static void main(String[] args) {
		
rulesOutput();
letsPlay();
	}

	public static void rulesOutput() {
		System.out.println("Let's play a game of Uppfor!\n");
		System.out.println("Choose either Skadis, Tjusig, Klyket, Hovolm, or Pershult\n");
		System.out.println("Pershult beats Klyket, Skadis");
		System.out.println("Klyket beats Tjusig, Hovolm");
		System.out.println("Tjusig beats Pershult, Skadis");
		System.out.println("Skadis Beats Hovolm, Klyket");
		System.out.println("Hovolm beats Pershult, Tjusig\n");
		System.out.println("If we choose the same, I win!\n");
	}
	
	public static String userInput() {
		System.out.print("Enter your choice (Skadis, Tjusig, Klyket, Hovolm, or Pershult): ");
		Scanner input = new Scanner(System.in);
		String userInput = input.next();
		userInput = userInput.toUpperCase().charAt(0) + userInput.substring(1).toLowerCase();
		System.out.println("\nYou have chosen: " + userInput);
		return userInput;
		
	}
	
	public static String computerChoice () {
		Random rndInt = new Random();
		switch (rndInt.nextInt(5)) {
		case 0:
			return "Skadis";
		case 1:
			return "Tjusig";
		case 2:
			return "Klyket";
		case 3:
			return "Hovolm";
		default:
			return "Pershult";
		
		}
	}
	
	public static boolean valUserInput (String userCho) {
		switch (userCho.charAt(0)) {
		
		
		case 'S':
			if (compareString(userCho.substring(1), "kadis") == true) {
				return true;
			}
		case 'T':
			if (compareString(userCho.substring(1), "jusig") == true) {
				return true;
			}
		case 'K':
			if (compareString(userCho.substring(1), "lyket") == true) {
				return true;
			}
		case 'H':
			if (compareString(userCho.substring(1), "ovolm") == true) {
				return true;
			}
		case 'P':
			if (compareString(userCho.substring(1), "ershult") == true) {
				return true;
			}
		default:
			return false;
			}
}
		
	
	public static boolean compareString (String x, String y) {
		if (x.length() == y.length()) {
			for (int i = 0; i < x.length(); i++) {
				if (x.charAt(i) != y.charAt(i)) {
					return false;
				}
				return true;
			}
		}
		return false;
		
	
}
	public static boolean winnerDinner (String userCho, String compCho) {
		switch (userCho.charAt(0)) {
		case 'S':
			if (compCho.charAt(0) == 'H' || compCho.charAt(0) == 'K') {
				return true;
			} else {
				return false;
			}
		case 'T':
			if (compCho.charAt(0) == 'P' || compCho.charAt(0) == 'S') {
				return true;
			} else {
				return false;
			}
		case 'K':
			if (compCho.charAt(0) == 'T' || compCho.charAt(0) == 'H') {
				return true;
			} else {
				return false;
			}
		case 'H':
			if (compCho.charAt(0) == 'P' || compCho.charAt(0) == 'T') {
				return true;
			} else {
				return false;
			}
		case 'P':
			if (compCho.charAt(0) == 'K' || compCho.charAt(0) == 'S') {
				return true;
			} else {
				return false;
			}
		default:
			System.out.println("Something strange has occured...");
			return false;
		}
	}
 
	public static void letsPlay() {
		Scanner input = new Scanner(System.in);
		char playCho = 'n';
		int rounds = 0;
		int userWins = 0;
		int compWins = 0; 
		
		System.out.print("Would you like to play (y/n)? ");
		playCho = input.next().charAt(0);
		if (playCho == 'n') {
			System.out.println("LOL OKAY BYE..");
			return;
	}
		while (playCho != 'n') {
			rounds++;
			String compChoice = computerChoice();
			String userChoice = userInput();
			
			if (valUserInput(userChoice) == false) {
				System.out.println("Not a valid choice. Try again...");
				userChoice = userInput();
			}
			
			System.out.println("I have chosen: " + compChoice + '\n');
			
			if (winnerDinner(userChoice, compChoice) == true) {
				userWins++;
				System.out.println("You are victorious!\n");
			} else {
				System.out.println("I am victorious!\n");
				compWins++;
			}
			
			System.out.print("Would you like to play again (y/n)? ");
			playCho = input.next().charAt(0);
		}
			
		
		
		
		
		
		
	}
	}
	
		

	
	
	

