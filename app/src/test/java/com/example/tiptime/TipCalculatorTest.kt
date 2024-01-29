package com.example.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTest {

    @Test
    fun calculateTip_20PercentNoRoundup() {
        val expected = NumberFormat.getCurrencyInstance().format(2)
        assertEquals(expected, calculateTip(10.0, 20.0, false))
    }

    @Test
    fun calculateTip_15PercentYesRoundup() {
        val expected = NumberFormat.getCurrencyInstance().format(14)
        assertEquals(expected, calculateTip(88.5, 15.0, true))
    }

}