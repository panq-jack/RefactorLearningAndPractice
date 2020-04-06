package com.jackpan.chapater1;

import com.jackpan.chapater1.refactor0.Customer;
import com.jackpan.chapater1.refactor0.Movie;
import com.jackpan.chapater1.refactor0.Rental;
import com.jackpan.chapater1.refactor1.Customer1;
import com.jackpan.chapater1.refactor1.Movie1;
import com.jackpan.chapater1.refactor1.Rental1;
import com.jackpan.chapater1.refactor2.Customer2;
import com.jackpan.chapater1.refactor2.Movie2;
import com.jackpan.chapater1.refactor2.Rental2;
import com.jackpan.chapater1.refactor2.price.ChildrenMoviePrice;
import com.jackpan.chapater1.refactor2.price.RegularMoviePrice;
import com.jackpan.chapater1.refactor2.price.ReleaseMoviePrice;

public class Main {

    public static void main(String[] args) {
        // write your code here
        beforeRefactor();
        afterRefactor1();
        afterRefactor2();
    }

    /**
     * before refactor
     */
    private static void beforeRefactor() {
        Customer customer = new Customer("old jack pan");
        customer.addRental(new Rental(new Movie("spider man", Movie.CHILDREN_MOVIE), 3));
        customer.addRental(new Rental(new Movie("ET", Movie.REGULAR_MOVIE), 2));
        customer.addRental(new Rental(new Movie("let bullet fly", Movie.RELEASE_MOVIE), 4));
        String statement = customer.statement();
        System.out.println(statement);
    }

    /**
     * after refactor
     */
    private static void afterRefactor1() {
        System.out.println(" -------------refactor 1---------------");

        Customer1 customer = new Customer1("jack pan [1]");
        customer.addRental(new Rental1(new Movie1("spider man", Movie.CHILDREN_MOVIE), 3));
        customer.addRental(new Rental1(new Movie1("ET", Movie.REGULAR_MOVIE), 2));
        customer.addRental(new Rental1(new Movie1("let bullet fly", Movie.RELEASE_MOVIE), 4));
        String statement = customer.statement();
        System.out.println(statement);
    }

    /**
     * after refactor
     */
    private static void afterRefactor2() {
        System.out.println(" -------------refactor 2 with polymorphism---------------");
        Customer2 customer = new Customer2("jack pan [2]");
        Movie2 movie = new Movie2("spider man", new ChildrenMoviePrice());
        customer.addRental(new Rental2(movie, 3));
        customer.addRental(new Rental2(new Movie2("ET", new RegularMoviePrice()), 2));
        customer.addRental(new Rental2(new Movie2("let bullet fly", new ReleaseMoviePrice()), 4));
        String statement = customer.statement();
        System.out.println(statement);

        // change movie price
        System.out.println(" -------------refactor 2 change movie price type ---------------");
        movie.setPrice(new ReleaseMoviePrice());
        System.out.println(customer.statement());

    }
}
