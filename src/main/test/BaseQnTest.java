package main.test;

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
        System.out.println(
                duration.toString().replace("PT", "")
                        .replace("H", "小时")
                        .replace("M", "分")
                        .replace("S", "秒"));
    }

    public void resetStartInstant() {
        startInstant = Instant.now();
        outputStartInstant();
    }

    private void outputStartInstant() {
        System.out.println(startInstant.toString());
    }

    private void outputEndInstant() {
        System.out.println(endInstant.toString());
    }
}
