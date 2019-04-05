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
        System.out.print("Enter Month:(Enter Number)");
        int month = keyboard.nextInt();
        System.out.print("Enter Year");
        int year = keyboard.nextInt();


        if (month == 1 || month == 2) {

            month = (month == 1) ? 13 : 14;
            year--;

        }



            int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100)
                    + year(year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;


            System.out.print("Day of the week is");
            switch (dayOfWeek)

            {
                case 1:
                    System.out.println("You were born on a Saturday");
                    System.out.println("Saturdays Child Work Hard For Their Living");
                    break;
                case 2:
                    System.out.print("You were born on a Sunday");
                    System.out.print("The Child That is Born On The Sabbath Day Is " +
                            "Fair And Wise And Good In Every Way");
                    break;
                case 3:
                    System.out.print("You were born on a Monday");
                    System.out.print("Mondays Child Is Fair Of Face");
                    break;
                case 4:
                    System.out.print("You were born on a Tuesday");
                    System.out.print("Tuesday Child Is Full of Grace");
                    break;
                case 5:
                    System.out.print("You were bron on a Wednesday");
                    System.out.print("Wednesdays Child Is Full Of Woe");
                    break;
                case 6:
                    System.out.print("You were born on a Thursday");
                    System.out.print("Thursday Child Has Far To Go");
                    break;
                case 7:
                    System.out.print("You were born on a Friday");
                    System.out.print("Fridays Child Is Loving And Giving");
                    break;

            }









    }


}
