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

    public long _min() {
        long min = users.get(0);
        for (long iterator : users) {
            if (iterator < min) {
                min = iterator;
            }
        }
        return min;
    }

    public long _max() {
        long max = users.get(0);
        for (long iterator : users) {
            if (iterator > max) {
                max = iterator;
            }
            
        }
        return max;
    }

    public long _sum() {
        long summa = 0;
        for (int i = 0; i < users.size(); i++) {
            summa += users.get(i);
        }
        return summa;
    }

    public long _mult() {
        long mult = 1;
        for (int i = 0; i < users.size(); i++) {
            mult *= users.get(i);
        }
        return mult;
    }
    public double _sr() {
        return (double) this._sum() /users.size();
    }



//    public boolean add(String user) {
//        return users.add(user);
//    }


}
