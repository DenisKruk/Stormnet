package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{6,-2,5,4,2,3,2,1};
        doubleSort(arr);
       int array[] =new int[] {4,9,2,5};
    }

    private static void doubleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
                System.out.println();
            }
            System.out.println();
            System.out.println("stored array: " + Arrays.toString(arr));
        }

    }
    private static int getMaxFromArray(int[]array) {
        int indexOfMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return array[indexOfMax];
    }
    private static int getMinFromArray(int[]array) {
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return array[indexOfMin];
    }
}
