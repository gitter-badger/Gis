package com.cursova.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class TimeDateTest {

    @org.junit.Test
    public void testMain() throws Exception {

            // Make a new Date object. It will be initialized to the current time.
            Date now = new Date();

            DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            String s = formatter.format(now);
            System.out.println(s);
    }
}