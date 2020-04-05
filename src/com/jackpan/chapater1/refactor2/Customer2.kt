package com.jackpan.chapater1.refactor1

import java.lang.StringBuilder

/**
 * Created by i520130(jackpan0321@gmail.com) on 05/04/2020
 */
class Customer2(private val name: String) {

    var rentals: MutableList<Rental2> = mutableListOf()


    fun addRental(rental: Rental2) {
        rentals.add(rental)
    }

    /**
     * print rental fees and earned points
     */
    fun statement(): String {

        var result = StringBuilder().append("Rental Record for $name:\n")

        result.append("total fees is: ${getCharge(result)} \n")

        result.append("points you earned is : ${getFrequentRenterPoints()}")

        return result.toString()
    }


    private fun getCharge(result: StringBuilder): Double {
        var totalAmount = 0.0
        for (rental in rentals) {
            var thisAmount = rental.getCharge()
            result.append("\t ${rental.movie.title}  fee is: $thisAmount \n")
            totalAmount += thisAmount
        }
        return totalAmount
    }

    private fun getFrequentRenterPoints(): Int {
        var frequentRenterPoints = 0

        for (rental in rentals) {
            frequentRenterPoints += rental.getFrequentRenterPoints()
        }
        return frequentRenterPoints
    }

}