/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie.list;

/**
 *
 * @author Adam
 */
public class Movie {
    private String movietitle;
    private String rating;
    private int year;
    private int runTime;
    public Movie(String title, String rating, int year, int runTime)
    {
        this.movietitle = title;
        this.rating = rating;
        this.year = year;
        this.runTime = runTime;
    }
    public String getMovieTitle()
    {
        return movietitle;
    }
    public void setMovieTitle(String value)
    {
        movietitle = value;
    }
    public int getMovieYear()
    {
        return year;
    }
    public int getMovieRunTime()
    {
        return runTime;
    }
    public void setMovieYear(int value)
    {
        year = value;
    }
    public void setMovieRunTime(int value)
    {
        runTime = value;
    }
    public String toString()
    {
        return "Movie title: " + movietitle +
                "\n Rating: " + rating +
                "\n Year: " + year +
                "\n Total runtime: " + runTime;
    }
}
