import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		String firstName, lastName, color, quitter;
		int age, siblings;
		float birthday;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your First Name:");
		firstName = input.next();
		if (firstName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		
		System.out.println("Enter your Last Name:");
		lastName = input.next();
		if (lastName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		
		System.out.println("How old are you?");
		quitter = input.next();
		if (quitter.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		age = Integer.parseInt(quitter);

		System.out.println("What number month were you born on?");
		quitter = input.next();
		if (quitter.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		birthday = Integer.parseInt(quitter);

		System.out.println("What is your favourite ROYGBIV color? (Enter Help for list of colors)");
		color = input.next();
		while(!(color.toLowerCase().equals("red")||color.toLowerCase().equals("orange")||color.toLowerCase().equals("yellow")||color.toLowerCase().equals("green")||color.toLowerCase().equals("blue")||color.toLowerCase().equals("indigo")||color.toLowerCase().equals("violet"))){
			if(color.toLowerCase().equals("help")) {
				System.out.println("ROYGBIV colors are: Red, Orange, Yellow, Green, Blue, Indigo, and Violet.");
			}
			if(color.toLowerCase().equals("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}
			System.out.println("Please pick a valid color. (Enter Help for a list of colors)");
			color = input.next();
		}
		if (color.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

		System.out.println("How many siblings do you have?");
		quitter = input.next();
		if (quitter.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		siblings = Integer.parseInt(quitter);
		
		if (age%2 == 0) {
			age = 2720;
		}
		else {
			age = 151;
		}
		
		if (siblings > 3) {
			quitter = "Portland, OR";
		}
		if (siblings < 0) {
			quitter = "Detroit, MI";
		}
		if (siblings == 3) {
			quitter = "Boston, MA";
		}
		if (siblings == 2) {
			quitter = "Orlando, FL";
		}
		if (siblings == 1) {
			quitter = "New York, NY";
		}
		if (siblings == 0) {
			quitter = "Las Vegas, NV";
		}
		
		color = color.toLowerCase();
		if (color.equals("red")) {
			color = "Ferrari";
		}
		if (color.equals("orange")) {
			color = "Hummer";
		}
		if (color.equals("yellow")) {
			color = "Buggy";
		}
		if (color.equals("green")) {
			color = "Tesla";
		}
		if (color.equals("blue")) {
			color = "Porche";
		}
		if (color.equals("indigo")) {
			color = "Motorcycle";
		}
		if (color.equals("violet")) {
			color = "Invisible Boat";
		}
		
		if (birthday > 0 && birthday < 5) {
			birthday = 27.95f;
		}
		else if (birthday > 4 && birthday < 9) {
			birthday = 259.91f;
		}
		else if (birthday > 8 && birthday < 13) {
			birthday = 999.99f;
		}
		else {
			birthday = 00.01f;
		}
		
		System.out.printf("%s %s will 'retire' in %d years somehow saving $%.2f in the bank with a vacation home near, but not in, %s; All while riding around in a rusty %s.", firstName, lastName, age, birthday, quitter, color);
	}
}
