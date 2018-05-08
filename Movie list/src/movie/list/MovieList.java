/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie.list;
import java.util.Scanner;
/**
 *
 * @author Adam
 */
public class MovieList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String movie, rating;
       int year, runtime;
       Movie favouriteMovie;
       System.out.println("Please enter movie title: ");
       movie=in.nextLine();
       System.out.println("Please enter movie rating: ");
       rating=in.nextLine();
       System.out.println("Please enter movie year: ");
       year=in.nextInt();
       System.out.println("Please enter movie runtime: ");
       runtime=in.nextInt();
       favouriteMovie = new Movie(movie,rating,year,runtime);
       System.out.println(favouriteMovie.toString());
    }
    
}
