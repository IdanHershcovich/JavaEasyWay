import java.util.Scanner;
public class HiLo {

	
	public static void Check (int guess, int correct) {
		if (guess < correct) {
			System.out.println("That's too low");
		}
		else if (guess > correct) {
			System.out.println("That's too high");
		}
		else if(guess == correct){
			System.out.println("You got it!");
		}
	}
	public static void main(String[] args) {
//		Create a random number for people to guess
		Scanner scan = new Scanner(System.in);
		int theNumber = (int)(Math.random() * 100 + 1);
		System.out.println(theNumber);
		int guess = 0;
		System.out.println("Guess a number between 1 and 100: ");
		guess = scan.nextInt();
		System.out.println("You entered " + guess + ".");
		Check(guess, theNumber);
	}

}
 
