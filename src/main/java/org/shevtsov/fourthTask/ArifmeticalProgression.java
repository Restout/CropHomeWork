package org.shevtsov.fourthTask;

import java.util.Scanner;

public class ArifmeticalProgression {
    public static void main(String[] args) {


        long sum = calculateSum(args);

        System.out.println("Сумма арифметической прогрессии: " + sum);
    }

    public static long calculateSum(String [] args) {
        int firstElement=Integer.valueOf(args[0]);
        int difference=Integer.valueOf(args[1]);
        int numberOfElements=Integer.valueOf(args[2]);

        long sum = 0;

        for (int i = 0; i < numberOfElements; i++) {
            sum += firstElement + (i * difference);
        }
        return sum;
    }
}
