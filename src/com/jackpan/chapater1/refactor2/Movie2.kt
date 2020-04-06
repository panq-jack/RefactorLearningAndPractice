package com.jackpan.chapater1.refactor2

import com.jackpan.chapater1.refactor2.price.IPrice

/**
 * Created by i520130(jackpan0321@gmail.com) on 05/04/2020
 */
class Movie2 constructor(val title: String, var price: IPrice) {

    fun getCharge(rentDays: Int): Double {
        return price.getCharge(rentDays)
    }

    fun getFrequentRenterPoints(rentDays: Int): Int {
        return price.getFrequentRenterPoints(rentDays)
    }

}