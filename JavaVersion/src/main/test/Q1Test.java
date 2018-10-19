package main.test;

import main.questions.Q1;

public class Q1Test extends BaseQnTest {

    @org.junit.Test
    public void scheme1() {
        Q1.initData();
        resetStartInstant();
        Q1.scheme1();
    }
}
