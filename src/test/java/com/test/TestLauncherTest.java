package com.test;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLauncherTest {

    //    void userEmpty() {
//        System.out.println("Test 1" + this);
//        UserService userService = new UserService();
//        List<String> users = userService.getAll();
//        assertTrue(users.isEmpty()); //t1 = nanoTime  через Timeout, чтобы упало
//    }
    @Test
    public void test_summ() throws IOException {
        long t1 = System.nanoTime();
        UserService userService = new UserService();
        assertEquals(0, userService._sum());
        long t2 = System.nanoTime();
        System.out.println(t2 - t1);
    }

    @Test
    public void test_max() throws IOException {
        long t1 = System.nanoTime();
        UserService userService = new UserService();
        assertEquals(5, userService._max());
        long t2 = System.nanoTime();
        System.out.println(t2 - t1);

    }

    @Test
    public void test_min() throws IOException {
        long t1 = System.nanoTime();
        UserService userService = new UserService();
        assertEquals(1, userService._min());
        long t2 = System.nanoTime();
        System.out.println(t2 - t1);
    }

    @Test
    public void test_mult() throws IOException {
        long t1 = System.nanoTime();
        UserService userService = new UserService();
        assertEquals(120, userService._mult());
        long t2 = System.nanoTime();
        System.out.println(t2 - t1);
    }
    @Test
    public void test_sr() throws IOException {
        long t1 = System.nanoTime();
        UserService userService = new UserService();
        assertEquals(3.0, userService._sr());
        long t2 = System.nanoTime();
        System.out.println(t2 - t1);
    }





}
