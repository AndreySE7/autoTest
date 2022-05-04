import kotlin.text.format

fun main() {

    println(calculate())

}

fun calculate(amount: Double = 100.00, commission: Double = 0.075, minCommission: Double = 35.00): String {

    val finalCommission = if (amount * commission < minCommission) { minCommission
    } else { amount * commission }

    val amountFormat = String.format("%.2f", amount) //отформатированный до сотых вывод введеной суммы перевода
    val finalCommissionFormat = String.format("%.2f", finalCommission) //отформатированный до сотых вывод комиссии
    val finalSumFormat = String.format("%.2f", (amount - finalCommission)) //отформатированный до сотых вывод перевода

    return "При переводе: $amountFormat \nКомиссия составит: $finalCommissionFormat \nСумма к зачислению: $finalSumFormat"

}
