package ru.netology

fun main() {


    val itemPrice = 1001
    var regularСustomer = true

    var totalPrice: Double = 0.00
    val discountStart = 1_000
    var startDiscount = 100
    val regularСustomerCnt = 0.01
    val discountMinLimit = 10_000
    val overLimitCnt = 0.05
    val haveRightToDiscount = if (itemPrice > discountStart) true else false

    if (haveRightToDiscount && itemPrice <= discountMinLimit) {
        val secondMath = itemPrice - startDiscount // от 100 р
        totalPrice = if (regularСustomer) (secondMath - (secondMath * regularСustomerCnt))
        else (itemPrice - startDiscount).toDouble()
    } else if (haveRightToDiscount && itemPrice > discountMinLimit) {

        val secondMath = itemPrice - (itemPrice * overLimitCnt) //получили сумму за вычетом 5%
        totalPrice = if (regularСustomer) (secondMath - (secondMath * regularСustomerCnt)) else secondMath
    }
    println("Стоимость покупки составит $totalPrice руб.")

}
