package main.test

import main.utils.SoutUtils
import org.junit.After
import org.junit.Before
import java.time.Duration
import java.time.Instant

open class BaseQnTest {
    private var startInstant: Instant? = null
    private var endInstant: Instant? = null

    @Before
    fun before() {
        resetStartInstant()
    }

    @After
    fun after() {
        endInstant = Instant.now()
        outputEndInstant()
        val duration: Duration = Duration.between(startInstant, endInstant)
        SoutUtils.sout(duration.toString().replace("PT", "")
                .replace("H", "小时")
                .replace("M", "分")
                .replace("S", "秒"));
    }

    fun resetStartInstant() {
        startInstant = Instant.now()
        outputStartInstant()
    }

    private fun outputStartInstant() {
        SoutUtils.sout(startInstant.toString())
    }

    private fun outputEndInstant() {
        SoutUtils.sout(endInstant.toString())
    }
}