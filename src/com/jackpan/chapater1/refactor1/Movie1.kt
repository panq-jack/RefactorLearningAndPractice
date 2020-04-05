package com.jackpan.chapater1.refactor1

/**
 * Created by i520130(jackpan0321@gmail.com) on 05/04/2020
 */
class Movie1 constructor(val title: String) {

    companion object {
        const val CHILDREN_MOVIE = 0
        const val REGULAR_MOVIE = 1
        const val RELEASE_MOVIE = 2
    }

    var priceLevel: Int = CHILDREN_MOVIE

    constructor(title: String, priceLevel: Int) : this(title) {
        this.priceLevel = priceLevel
    }

    fun getCharge(rentDays: Int): Double {
        var thisAmount = 0.0

        when (priceLevel) {
            CHILDREN_MOVIE -> {
                thisAmount += 1.5
                if (rentDays > 3) {
                    thisAmount += (rentDays - 3) * 1.5
                }
            }

            REGULAR_MOVIE -> {
                thisAmount += 2.0
                if (rentDays > 2) {
                    thisAmount += (rentDays - 2) * 1.5
                }
            }

            RELEASE_MOVIE -> {
                thisAmount += (rentDays * 3).toDouble()
            }
        }
        return thisAmount
    }

    fun getFrequentRenterPoints(rentDays: Int): Int {
        var frequentRenterPoints = 0
        frequentRenterPoints++
        if (priceLevel == REGULAR_MOVIE && rentDays > 1) {
            frequentRenterPoints++
        }
        return frequentRenterPoints
    }


}