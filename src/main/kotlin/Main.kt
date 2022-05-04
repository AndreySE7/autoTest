fun main() {

    println(calculate())

}

fun calculate(amount: Double = 1000.00, commission: Double = 0.075, minCommission: Double = 35.00): String {

    val finalCommission = if (amount * commission < minCommission) { minCommission
    } else { amount * commission }
    val finalSum = amount - finalCommission

    return "При переводе: $amount \nКомиссия составит: $finalCommission \nСумма к зачислению: $finalSum"

}