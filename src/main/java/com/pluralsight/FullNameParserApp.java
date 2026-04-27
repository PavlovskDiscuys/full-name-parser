package com.pluralsight;
import java.util.Arrays;
import java.util.Scanner;

public class FullNameParserApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstFormat = "First name: \n" + "" +
                "Last name: \n";

        String secondFormat = "First name: \n" +
                "Middle name: \n" +
                "Last name: \n";


        // First Format
        System.out.println("First and Last name format? OR First Middle and Lastname format?");
        System.out.println("Chose format (A/B): ");
        String formatInput = input.nextLine().trim().toLowerCase();

        String defaultFormat = formatInput.equals("a") ? firstFormat : secondFormat;

        System.out.println("\n" + defaultFormat);
        System.out.print("Enter full name on one line: ");
        String[] userInput = input.nextLine().trim().split("\\s+");

        String first = userInput[0];
        String middle = "";
        String last = "";

        if (formatInput.equals("a")) {
            if(userInput.length > 1) {
                last = String.join(" ", Arrays.copyOfRange(userInput, 1, userInput.length - 1));
            }
        } else {
            if (userInput.length == 2) {
                last = userInput[1];
            } else if (userInput.length > 2) {
                last = userInput[userInput.length - 1];
                middle = String.join(" ", Arrays.copyOfRange(userInput, 1, userInput.length - 1));
            }
        }
    }
}
