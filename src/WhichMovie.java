import java.util.ArrayList;
import java.util.Scanner;

public class WhichMovie {

	public static void main(String[] args) {

		boolean keepGoing = true;
		ArrayList<Movie> al = new ArrayList<Movie>();
		Scanner scnr = new Scanner(System.in);

		for (int i = 1; i < 101; i++) {
			al.add(MovieIO.getMovie(i));
		}

		System.out.println("==============================================");
		System.out.println("Welcome to Sean's Movie Store. \rHere is your selection of Genres.");

		while (keepGoing) {

			System.out.println("==============================================");
			System.out.println("1) Drama 2) Musical 3) Scifi \r4) Horror 5) Comedy 6) Animated");
			System.out.println("Please choose the number.");
			int userInput = scnr.nextInt();
			boolean answered = false;

			while (answered == false) {

				System.out.println("==============================================");

				if (userInput == 1) {
					System.out.println("Drama Movies:");
					printMovies(al, "drama");
					answered = true;

				} else if (userInput == 2) {
					System.out.println("Musical Movies:");
					printMovies(al, "musical");
					answered = true;

				} else if (userInput == 3) {
					System.out.println("SciFi Movies:");
					printMovies(al, "scifi");
					answered = true;

				} else if (userInput == 4) {
					System.out.println("Horror Movies:");
					printMovies(al, "horror");
					answered = true;

				} else if (userInput == 5) {
					System.out.println("Comedy Movies:");
					printMovies(al, "comedy");
					answered = true;

				} else if (userInput == 6) {
					System.out.println("Animated Movies:");
					printMovies(al, "animated");
					answered = true;

				} else {
					System.out.println("That isn't a number between 1 and 6, try again.");
					break;
				}

				System.out.println("==============================================");
				System.out.println("Would you like to look at another genre? (y/n)");
				String cont = scnr.next().toLowerCase();
				if (cont.equals("y")) {
					keepGoing = true;
				} else if (cont.equals("n")) {
					keepGoing = false;
				}
			}
		}
		System.out.println("Have a nice day(:");
		System.out.println("==============================================");
		scnr.close();
	}

	public static void printMovies(ArrayList<Movie> al, String s) {
		for (int i = 0; i < 100; i++) {
			if (al.get(i).getGenre().equalsIgnoreCase(s)) {
				System.out.println(al.get(i).getName());
			}
		}
	}
}
