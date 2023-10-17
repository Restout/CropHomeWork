package org.shevtsov.fourthTask;

import java.util.Scanner;

public class ArifmeticalProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstElement = scanner.nextInt();
        int difference = scanner.nextInt();
        int numberOfElements = scanner.nextInt();

        long sum = calculateSum(firstElement, difference, numberOfElements);

        System.out.println("Сумма арифметической прогрессии: " + sum);
    }

    public static long calculateSum(int firstElement, int difference, int numberOfElements) {
        long sum = 0;

        for (int i = 0; i < numberOfElements; i++) {
            sum += firstElement + (i * difference);
        }
        return sum;
    }
}
