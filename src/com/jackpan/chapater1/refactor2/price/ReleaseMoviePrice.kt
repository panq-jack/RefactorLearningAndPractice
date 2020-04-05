package com.jackpan.chapater1.refactor2.price

/**
 * Created by i520130(jackpan0321@gmail.com) on 05/04/2020
 */
class ReleaseMoviePrice : IPrice {

    override fun getCharge(rentDays: Int): Double = (rentDays * 3).toDouble()

    override fun getFrequentRenterPoints(rentDays: Int): Int = 1
}