package com.jackpan.chapater1.refactor0;

import java.util.ArrayList;
import java.util.List;

/**
 * Class {@code Customer}
 * Designed to represent a customer, to collect the rental fees and earned points of a customer.
 * <p> provide following functions:</p>
 * @see Customer#statement()
 * @see Customer#addRental(Rental)
 *
 * <p>functions for internal usage:</p>
 *
 * @version 1.0
 * @author Jack Pan
 * Created by i520130(jackpan0321@gmail.com) on 05/04/2020
 */
public class Customer {

    public String name;

    public List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    /**
     * for add a rental
     * @param rental: rental
     */
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /**
     * print rental fees and earned points
     *
     * @return statement
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        String result = "Rental Record for " + name + ":\n";

        for (Rental rental : rentals) {
            double thisAmount = 0;
            // fees
            switch (rental.movie.priceLevel) {
                case Movie.CHILDREN_MOVIE:
                    thisAmount += 1.5;
                    if (rental.rentDays > 3) {
                        thisAmount += (rental.rentDays - 3) * 1.5;
                    }
                    break;

                case Movie.REGULAR_MOVIE:
                    thisAmount += 2;
                    if (rental.rentDays > 2) {
                        thisAmount += (rental.rentDays - 2) * 1.5;
                    }
                    break;

                case Movie.RELEASE_MOVIE:
                    thisAmount += (rental.rentDays) * 3;
                    break;
            }

            // points
            frequentRenterPoints++;
            if (rental.movie.priceLevel == Movie.REGULAR_MOVIE && rental.rentDays > 1) {
                frequentRenterPoints++;
            }

            result += "\t" + rental.movie.title + "\t" + "fee is: " + thisAmount + "\n";

            totalAmount += thisAmount;
        }

        result += "total fees is: " + totalAmount + "\n";
        result += "points you earned is : " + frequentRenterPoints;

        return result;
    }
}
