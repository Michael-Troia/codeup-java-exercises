package movies;

import java.util.Arrays;
import util.Input;
public class MoviesApplication {
    static Movie[] movies = MoviesArray.findAll(); //moviesarray returns an array "Movie[]" made of Movie class

    // movie is outside of main and static to make accessible
    public static void main(String[] args) {//application is separate on purpose to divide concerns
        Input input = new Input(); //todo this comes from the Input class created earlier
        boolean selecting = true;
        while (selecting) {
            System.out.println("What would you like to do?\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n");

            switch (input.getInt(0, 5)) {
                case 0:
                    System.exit(0);
                    selecting = false;
                    break;
                case 1:
                    System.out.println("All movies: \n");
                    for (Movie movie : movies) { // this will do something to each element from line 8
                        System.out.println(movie.getName() + " " + movie.getCategory());
                    }
                    break;
                case 2:
                    printMovies("animated");
                    break;
                case 3:
                    printMovies("drama");
                    break;
                case 4:
                    printMovies("horror");
                    break;
                case 5:
                    printMovies("scifi");
                    break;
                default:
                    System.out.println("error");
            }
        }
    }
    public static void printMovies(String category) {
        System.out.println(category + "movies: \n");
        for (Movie movie : movies) { // this will do something to each element from line 8
            System.out.println(movie.getName() + " " + movie.getCategory());
        }
    }
}