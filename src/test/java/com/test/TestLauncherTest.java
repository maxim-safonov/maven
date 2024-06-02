package com.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
@Timeout(value = 300, unit = TimeUnit.MILLISECONDS)

public class TestLauncherTest {


    @Test
    public void test_summ() throws IOException {
        UserService userService = new UserService();
        long[] ans = userService._sum();
        assertEquals(15, ans[0]);
        System.out.println(ans[1]);
    }

    @Test
    public void test_max() throws IOException {
        UserService userService = new UserService();
        long[] ans = userService._max();
        assertEquals(5, ans[0]);
        System.out.println(ans[1]);

    }

    @Test
    public void test_min() throws IOException {
        UserService userService = new UserService();
        long[] ans = userService._min();
        assertEquals(1, ans[0]);
        System.out.println(ans[1]);
    }

    @Test
    public void test_mult() throws IOException {
        UserService userService = new UserService();
        long[] ans = userService._mult();
        assertEquals(120, ans[0]);
        System.out.println(ans[1]);
    }
    @Test
    public void test_sr() throws IOException {
        UserService userService = new UserService();
        double[] ans = userService._sr();
        assertEquals(3.0, ans[0]);
        System.out.println(ans[1]);
    }
    @Test
    @Disabled
    public void Failed() throws InterruptedException { //дописал падающий тестовый метод
        Thread.sleep(300);
    }





}
