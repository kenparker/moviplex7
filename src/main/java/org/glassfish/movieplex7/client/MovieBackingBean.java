package org.glassfish.movieplex7.client;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;

/**
 * ***********************************************************************************************
 *
 * @author magang
 * create date : 25.04.2014
 * change date :
 *
 * description: Java Magazine January/February 2014
 * Three Hundred Sixty–Degree Exploration of Java EE 7, Part 2
 *
 * flow:
 * <p/>
 *
 * Change Log:
 * 28.01.2013  * <p/>
 */
@Named
@SessionScoped
public class MovieBackingBean implements Serializable
{

    int movieId;
    String movieName;
    String actors;

    public String getMovieName()
    {
        return movieName;
    }

    public void setMovieName(String movieName)
    {
        this.movieName = movieName;
    }

    public String getActors()
    {
        return actors;
    }

    public void setActors(String actors)
    {
        this.actors = actors;
    }

    public int getMovieId()
    {
        return movieId;
    }

    public void setMovieId(int movieId)
    {
        this.movieId = movieId;
    }
}
