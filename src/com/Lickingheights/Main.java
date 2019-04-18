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
        Scanner continueKB;
        continueKB = new Scanner(System.in);
        String keepGoing;
        int go = 0;

        while (go == 0) {
        System.out.println("+---------------+");
        System.out.println("| Hello,Welcome |");
        System.out.println("+---------------+");
        System.out.println("Enter Month(Enter Number)");
        int month = keyboard.nextInt();
        System.out.println("Enter what day you were born on");
        int dayOfMonth = keyboard.nextInt();
        System.out.println("Enter Year");
        int year = keyboard.nextInt();


            if (month == 1 || month == 2) {

                month = (month == 1) ? 13 : 14;
                year--;

            }


            int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100)
                    + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;


            System.out.print("You were born on a ");
            switch (dayOfWeek)

            {
                case 0:
                    System.out.println("Saturday ");
                    System.out.println("Saturdays Child Work Hard For Their Living");
                    break;
                case 1:
                    System.out.println("Sunday ");
                    System.out.println("The Child That is Born On The Sabbath Day Is " +
                            "Fair And Wise And Good In Every Way  |");
                    break;
                case 2:
                    System.out.println("Monday  ");
                    System.out.println("Mondays Child Is Fair Of Face   ");
                    break;
                case 3:
                    System.out.println("Tuesday ");
                    System.out.println("Tuesday Child Is Full of Grace  ");

                    break;
                case 4:
                    System.out.println("Wednesday ");
                    System.out.println("Wednesdays Child Is Full Of Woe ");

                    break;
                case 5:
                    System.out.println("Thursday ");
                    System.out.println("Thursday's child has far to go ");
                    break;
                case 6:
                    System.out.println("Friday ");
                    System.out.println("Fridays Child Is Loving And Giving");
                    break;

            }


            System.out.println("Would you like to play again? ");
            System.out.println("Type 'y' for yes or 'n' for no");
            keepGoing = continueKB.nextLine();
            go = keepGoing.indexOf("y");
            System.out.println("Thanks for playing");







        }

    }


}
