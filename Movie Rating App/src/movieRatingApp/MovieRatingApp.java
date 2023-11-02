package movieRatingApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieRatingApp {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		StreamingWebsite movies = new StreamingWebsite();
		Movies aMovie = new Movies("Django Unchained","Quentin Tarantino");
		movies.add(aMovie);
		aMovie = new Movies("Corpse Bride","Tim Burton");
		movies.add(aMovie);
		aMovie = new Movies("Howl's Moving Castle","Hayao Miyazaki");
		movies.add(aMovie);
		aMovie = new Movies("Brokeback Mountain","Ang Lee");
		movies.add(aMovie);
		aMovie = new Movies("Titanic","James Cameron");
		movies.add(aMovie);
		
		char option = '?';
		
		while (Character.toUpperCase(option) !='C')
		{
			System.out.println("Please select an option");
			System.out.println("A. Display currently streaming movie list");
			System.out.println("B. Rate a movie");
			System.out.println("C. Exit");
			option = scan.next().charAt(0);

			if (Character.toUpperCase(option)=='A')
			{
				System.out.println(movies.toString());
			}
			
			else if(Character.toUpperCase(option)=='B')
			{
				int selection=0;
				System.out.println(movies.toString());
						
				while(selection>5 || selection<1)
				{
					try {
						System.out.println("Please select a movie by typing 1 to 5");
						selection = scan.nextInt();
						if (selection>5 || selection<1)
						{
							System.out.println("Invalid number: Please choose a number between 1 and 5");
						}
					} catch (InputMismatchException a)
					{
						System.out.println("Invalid input: Please choose an integer");
						scan.next();
					}
				}
				Movies selectedMovie = movies.displayMovie(selection);
				System.out.println("Your selection is: "+selectedMovie.getName()+" by "+selectedMovie.getDirector());

				double rating = 6;
				while (rating>5 || rating<0)
				{
					try {
						System.out.println("Please rate from 0 to 5");
						rating = scan.nextDouble();
						if (rating>5 || rating<0)
						{
							System.out.println("Invalid rating: Please choose a number between 0 and 5");
						}
					} catch (InputMismatchException b)
					{
						System.out.println("Invalid input: Please select an integer between 0 and 5");
						scan.next();
					}
				}
				selectedMovie.averageRating(rating);
				System.out.println(selectedMovie.toString());
			}
			
			else if (Character.toUpperCase(option)=='C')
			{
				System.out.println("Goodbye!");
				break;
			}
			else if (Character.toUpperCase(option)!='A' ||
					Character.toUpperCase(option)!='B' ||
					Character.toUpperCase(option)!='C')
			{
				System.out.println("Please choose a letter from A to C");
			}
			
		}

	}

}
