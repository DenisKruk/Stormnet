package com.company;

import java.util.Scanner;

public class Iskl {


    public static void main(String[] args) {
    }
        private static int getSum() {
        int sum = 0;
        Scanner scan = new Scanner(System.in);

            try {

                String input = scan.next();
                int number = Integer.valueOf(input);
                int[] x = {1,2,3};
                int a = x[number];

            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e ) {
                System.out.println("Выход за пределы массива");
            } finally {
                System.out.println("programm finished");
            }
            return sum;

        }
    }

