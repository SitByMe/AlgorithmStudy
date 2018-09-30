package main.test;

import main.questions.Q1;
import org.junit.After;
import org.junit.Before;

import java.time.Duration;
import java.time.Instant;

public class Q1Test {
    private Instant startInstant;
    private Instant endInstant;

    @Before
    public void before() {
        startInstant = Instant.now();
    }

    @After
    public void after() {
        endInstant = Instant.now();
        Duration duration = Duration.between(startInstant, endInstant);
        System.out.println(
                duration.toString().replace("PT", "")
                        .replace("H", "小时")
                        .replace("M", "分")
                        .replace("S", "秒"));
    }

    @org.junit.Test
    public void initData() {
        Q1.initData();
    }

    @org.junit.Test
    public void scheme1() {
        Q1.scheme1();
    }
}
