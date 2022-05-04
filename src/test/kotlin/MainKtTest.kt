import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculate_test_commission() {
        val amountFormatT = "1000,50"
        val finalCommissionFormatT = "75,04"
        val finalSumFormatT = "925,46"
        val amountT = 1000.50
        val commissionT = 0.075
        val minCommissionT = 35.00

        val result = calculate(
            amount = amountT,
            commission = commissionT,
            minCommission = minCommissionT,
        )

        assertEquals("При переводе: $amountFormatT \nКомиссия составит: $finalCommissionFormatT \nСумма к зачислению: $finalSumFormatT", result)

    }

    @Test
    fun calculate_test_min_commission() {
        val amountFormatT = "100,00"
        val finalCommissionFormatT = "35,00"
        val finalSumFormatT = "65,00"
        val amountT = 100.00
        val commissionT = 0.075
        val minCommissionT = 35.00

        val result = calculate(
            amount = amountT,
            commission = commissionT,
            minCommission = minCommissionT,
        )

        assertEquals("При переводе: $amountFormatT \nКомиссия составит: $finalCommissionFormatT \nСумма к зачислению: $finalSumFormatT", result)

    }

    @Test
    fun main_test() {

        val result = main()

        assertEquals(println(calculate()), result)

    }

}