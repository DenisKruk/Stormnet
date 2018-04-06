package com.company;

import java.util.Scanner;

public class Lesson604 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 1;
        int max = 5;
        int input = getUserInput(scan, min, max);
        int input1 = getUserInputRecursion(scan, min, max);
    }

    private static int getUserInputRecursion(Scanner scan, int min, int max) {
        int result;
        System.out.println("Please input number between " + min + " and " + max);
        try {
            String stringNumber = scan.next();
            result = Integer.valueOf(stringNumber);
        } catch (NumberFormatException e) {
            System.out.println("Wrong input");
            return getUserInputRecursion(scan, min, max);
        }
            if (result < min || result > max) {
                System.out.println("Inputed number is not between " + min + " and " + max);
                return getUserInputRecursion(scan, min, max);
            }

        return result;
    }

    private static int getUserInput(Scanner scan, int min, int max) {
        int result;
        while (true) {
            System.out.println("Please input number between " + min + " and " + max);
            try {
                String stringNumber = scan.next();
                result = Integer.valueOf(stringNumber);
            } catch (NumberFormatException e) {
                System.out.println("Wrong input");
                continue;
            }
            if (result < min || result > max) {
                System.out.println("Inputed number is not between " + min + " and " + max);
                continue;
            }
            break;
        }
        return result;
    }

}
