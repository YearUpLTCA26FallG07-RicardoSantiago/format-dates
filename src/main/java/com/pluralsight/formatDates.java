package com.pluralsight;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class formatDates {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String formattedDate = today.format(fmt1);
        System.out.println("Today is: " + formattedDate);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

       String formattedDate2 = today.format(fmt2);
       System.out.println("Today is: " + formattedDate2);

        //DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("E,MMM,dd,yyyy hh:mm:ss a");

        //String formattedDate = today.format(fmt3);
        //System.out.println("Today is: " + formattedDate);

        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("E,MMM,dd,yyyy hh:mm:ss a");

        String formattedDate4 = today.format(fmt4);
        System.out.println("Today is: " + formattedDate4);


    }
}
git