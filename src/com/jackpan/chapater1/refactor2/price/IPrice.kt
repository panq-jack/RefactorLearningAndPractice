package com.jackpan.chapater1.refactor2.price

/**
 * Created by i520130(jackpan0321@gmail.com) on 05/04/2020
 */
interface IPrice {

    fun getCharge(rentDays: Int): Double

    fun getFrequentRenterPoints(rentDays: Int): Int
}