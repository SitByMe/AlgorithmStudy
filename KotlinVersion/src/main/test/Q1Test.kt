package main.test

import main.questions.Q1
import org.junit.Test

class Q1Test : BaseQnTest() {

    @Test
    fun scheme1() {
        Q1.initData()
        resetStartInstant()
        Q1.scheme1()
    }
}