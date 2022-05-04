import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculate_test_commission() {

        val amountT = 1000.00
        val commissionT = 0.075
        val minCommissionT = 35.00

        val result = calculate(
            amount = amountT,
            commission = commissionT,
            minCommission = minCommissionT,
        )

        assertEquals("При переводе: 1000.0 \nКомиссия составит: 75.0 \nСумма к зачислению: 925.0", result)

    }

    @Test
    fun calculate_test_min_commission() {

        val amountT = 100.00
        val commissionT = 0.075
        val minCommissionT = 35.00

        val result = calculate(
            amount = amountT,
            commission = commissionT,
            minCommission = minCommissionT,
        )

        assertEquals("При переводе: 100.0 \nКомиссия составит: 35.0 \nСумма к зачислению: 65.0", result)

    }

    @Test
    fun main_test() {

        val result = main()

        assertEquals(println(calculate()), result)

    }

}