package com.jackpan.chapater1.refactor2.price

/**
 * Created by i520130(jackpan0321@gmail.com) on 05/04/2020
 */
class RegularMoviePrice : IPrice {

    override fun getCharge(rentDays: Int): Double {
        var thisAmount = 2.0
        if (rentDays > 2) {
            thisAmount += (rentDays - 2) * 1.5
        }
        return thisAmount
    }

    override fun getFrequentRenterPoints(rentDays: Int): Int =
        when (rentDays) {
            in 2 until Int.MAX_VALUE -> 2
            else -> 1
        }
}