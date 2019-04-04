package com.Lickingheights;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        // Create a method for returning the number of days in their birth month and the written form of their birth month.
        // Create a method for determining what day of the week the user was born on based on previously given input.
        // Create a method that will return the line of the poem that fits their birthday.
        // Need 5 commits

        Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter what day you were born on:(Enter Number)");
        int dayOfMonth = keyboard.nextInt();
        System.out.print("Enter Month:(Enter Number");
        int month = keyboard.nextInt();
        System.out.print("Enter Year");
        int year = keyboard.nextInt();


        if (month == 1 || month == 2) {

            month = (month == 1) ? 13 : 14;
            year--;

        }


        {
        int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100)
                + year (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;


        System.out.print("Day of the week is");
        switch(dayOfWeek)
            }












    }
}
