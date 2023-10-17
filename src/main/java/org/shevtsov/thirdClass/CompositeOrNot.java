package org.shevtsov.thirdClass;

import java.util.Scanner;

public class CompositeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        long number = scanner.nextLong();
        if (isPrime(number)) {
            System.out.println("Простое число");
        } else {
            System.out.println("Составное число");
        }
    }

    public static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
