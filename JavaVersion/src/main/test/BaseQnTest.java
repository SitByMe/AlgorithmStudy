package main.test;

import main.utils.SoutUtils;
import org.junit.After;
import org.junit.Before;

import java.time.Duration;
import java.time.Instant;

public abstract class BaseQnTest {
    private Instant startInstant;
    private Instant endInstant;

    @Before
    public void before() {
        resetStartInstant();
    }

    @After
    public void after() {
        endInstant = Instant.now();
        outputEndInstant();
        Duration duration = Duration.between(startInstant, endInstant);
        SoutUtils.soutln(
                duration.toString().replace("PT", "")
                        .replace("H", "小时")
                        .replace("M", "分")
                        .replace("S", "秒"));
    }

    void resetStartInstant() {
        startInstant = Instant.now();
        outputStartInstant();
    }

    private void outputStartInstant() {
        SoutUtils.soutln(startInstant.toString());
    }

    private void outputEndInstant() {
        SoutUtils.soutln(endInstant.toString());
    }
}
