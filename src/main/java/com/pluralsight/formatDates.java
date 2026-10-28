package com.pluralsight;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class formatDates {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E,MMM,dd,yyyy hh:mm:ss a");

        String formattedDate = today.format(fmt);
        System.out.println("Today is: " + formattedDate);


    }
}
