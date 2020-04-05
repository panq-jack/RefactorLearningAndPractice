package com.jackpan.chapater1.refactor1

/**
 * Created by i520130(jackpan0321@gmail.com) on 05/04/2020
 */
class Rental1(val movie: Movie1, private val rentDays: Int) {

    fun getCharge(): Double {
        return movie.getCharge(rentDays)
    }

    fun getFrequentRenterPoints(): Int {
        return movie.getFrequentRenterPoints(rentDays)
    }

}