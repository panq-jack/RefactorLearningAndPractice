package com.jackpan.chapater1.refactor2.price

/**
 * Created by i520130(jackpan0321@gmail.com) on 05/04/2020
 */
class ChildrenMoviePrice : IPrice {

    override fun getCharge(rentDays: Int): Double =
        when (rentDays) {
            in 4 until Int.MAX_VALUE -> 1.5 + (rentDays - 3) * 1.5
            else -> 1.5
        }

    override fun getFrequentRenterPoints(rentDays: Int): Int = 1
}