import java.util.Scanner;

public class Adventure {
	public static void main(String[] args) {
		// create some other variables we'll use throughout the game (favorite
		// food, beer, etc.)
		// might be useful to create a method for ending the game at a
		// particular branch. That way you don't need to keep adding statements
		// inside of loops
		String name;
		Scanner input = new Scanner(System.in);

		// used to restart the game at different points in the program
		String restart = "n";

		System.out.println("What is your name?");
		name = input.nextLine();

		do {
			System.out.println(name + "...");

			System.out.println(
					"It's a Friday night in Detroit. You've had a long week at work and you're not sure what the night holds.");
			System.out.print("What do you want to do? (Leave / Stay): ");
			String firstaction = input.nextLine();

			// first conditional - if the user enters "leave" end the game, if
			// they enter "stay" ask for next input
			if (firstaction.equalsIgnoreCase("leave")) {
				System.out.println("You left! Have fun in the suburbs you loser!");
				System.out.print("Would you like to play again? (Y / N): ");
				restart = input.nextLine();
			} else {
				System.out.println("Great decision " + name
						+ "! I've got a feeling that you have an intersting night ahead of you...");
				System.out.println(
						"Excited with your decision, you start walking down Grand River, not sure where exactly you're headed,");
				System.out.println(
						"when you hear a mechanical whirring growing louder behind you! Do you run away or turn to investigate? (Run / Turn)");
				String stay = input.nextLine();

				switch (stay.toLowerCase()) {
				case "run":
					System.out.println(
							"You start running, terrified! Tears streaming from your eyes you cry out, 'I'm too young to die!'");
					System.out.println(
							" Suddenly you trip on your shoelaces and fall hitting your head, knocking you unconcious and ending your night! Man, you suck!");
					System.out.println("Would you like to play again? (Y / N) ");
					restart = input.nextLine();
					// need to add a way to end the branch here

					break;
				case "turn":
					System.out.println(
							"You turn around and look behind you, when you realize that the noise is actually coming from above!");
					System.out.println("That's right " + name
							+ ", it's the People Mover! Do you want to board at the Broadway Station or keep walking? (board / walk): ");
					String turn = input.nextLine();
					// making sure restart is "n" just in case they entered "y"
					// earlier, so we can exit this switch statement.
					restart = "n";
					break;
				}
			}
		} while ((restart.equalsIgnoreCase("y")));
	}
}
