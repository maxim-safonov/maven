package com.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class UserService {


    ArrayList<Long> users;

    public UserService() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] s = br.readLine().split(" ");
        users = new ArrayList<>();
        for (String i : s) {
            users.add(Long.parseLong(i));
        }
    }

    public long[] _min() { // указал производительность на ИСХОДНЫХ методах
        long t1 = System.nanoTime();
        long min = users.get(0);
        for (long iterator : users) {
            if (iterator < min) {
                min = iterator;
            }
        }
        long t2 = System.nanoTime();
        return new long[]{min, t2 - t1};
    }

    public long[] _max() {
        long t1 = System.nanoTime();
        long max = users.get(0);
        for (long iterator : users) {
            if (iterator > max) {
                max = iterator;
            }

        }
        long t2 = System.nanoTime();
        return new long[]{max, t2 - t1};
    }

    public long[] _sum() {
        long t1 = System.nanoTime();
        long summa = 0;
        for (int i = 0; i < users.size(); i++) {
            summa += users.get(i);
            if (summa > Long.MAX_VALUE || summa < Long.MIN_VALUE) { //дописал exception на выход за границу
                throw new ArithmeticException();
            }
        }
        long t2 = System.nanoTime();
        return new long[]{summa, t2 - t1};
    }

    public long[] _mult() {
        long t1 = System.nanoTime();
        long mult = 1;
        for (int i = 0; i < users.size(); i++) {
            mult *= users.get(i);
            if (mult > Long.MAX_VALUE || mult < Long.MIN_VALUE) { //дописал exception на выход за границу
                throw new ArithmeticException();
            }
        }
        long t2 = System.nanoTime();
        return new long[]{mult, t2 - t1};
    }

    public double[] _sr() {
        long t1 = System.nanoTime();
        double sr = (double) this._sum()[0] / users.size(); // деление на 0 проверять не нужно, так как по условию чисел в файле минимум 1
        long t2 = System.nanoTime();
        return new double[]{sr, t2 - t1};
    }


}
