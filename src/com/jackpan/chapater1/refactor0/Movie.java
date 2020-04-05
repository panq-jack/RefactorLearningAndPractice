package com.jackpan.chapater1.refactor0;

/**
 * Created by i520130(jackpan0321@gmail.com) on 04/04/2020
 */
public class Movie {

    public static final int CHILDREN_MOVIE = 0;
    public static final int REGULAR_MOVIE = 1;
    public static final int RELEASE_MOVIE = 2;

    /**
     * title of the movie
     */
    public String title;

    /**
     * price for movie level
     */
    public int priceLevel;

    public Movie(String title, int priceLevel) {
        this.title = title;
        this.priceLevel = priceLevel;
    }
}
