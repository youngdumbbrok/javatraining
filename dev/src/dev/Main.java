package dev;
import java.util.*;
class Movie
{
    static String title, director;
    static double rating;
    
    public Movie(double r) {
        title = "Wakanda Forever";
        director = "Ryan Coolger";
        rating = r;
    }
    
    public static void getRating(Movie movies[]) {
        for(Movie movie: movies) {
            if(movie.rating > 3)
                System.out.println(movie.title);
        }
    }
    
    public static Movie[] movieUpperCase(Movie movies[]) {
        for(Movie movie: movies)
            movie.title = movie.title.toUpperCase();
        return movies;
    }
    
    public static void sortByDirector(Movie movies[]) {
        Arrays.sort(movies, new Comparator<Movie>(){
            public int compare(Movie m1, Movie m2) {
                return m1.title.compareTo(m2.title);
            }
        });
        printMovies(movies);
    }
    
    public static void printMovies(Movie[] movies) {
        for(Movie movie: movies)
            System.out.println(movie.title);
    }
}

public class Main {
    public static void main (String[] args) {
        Movie.printMovies(Movie.movieUpperCase(new Movie[]{new Movie(4), new Movie(5), new Movie(3)}));
    }
}