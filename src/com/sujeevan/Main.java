package com.sujeevan;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
         int[] myInyArray = getIntegers(5);

          int[] sorted = sortArray(myInyArray);
          printArray(sorted);
    }

    private static int[] getIntegers(int numbers)
    {
        int[] values = new int[numbers];
        for (int i=0;i<values.length;i++)
        {
            System.out.println("Enter Integer \r");
          values[i]=scanner.nextInt();
        }
        return values;
    }

    private static void printArray(int[] array)
    {
        for (int i=0;i<array.length;i++)
        System.out.println("Element " + i + " contents = " + array[i]);

    }

    private static int[] sortArray(int[] array) {

        System.out.println("Sorted Array");

        int[] sortedarray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedarray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;


            for (int j = 0; j < sortedarray.length - 1; j++) {
                if (sortedarray[j] < sortedarray[j + 1]) {
                    //int temp;
                    temp = sortedarray[j];
                    sortedarray[j] = sortedarray[j + 1];
                    sortedarray[j + 1] = temp;
                    flag = true;
                }
            }
            //return sortedarray;
        }
        return sortedarray;
    }
            //System.out.println(array[j]);

        }






