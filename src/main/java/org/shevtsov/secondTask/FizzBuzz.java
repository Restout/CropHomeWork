package org.shevtsov.secondTask;

public class FizzBuzz {

    public static void main(String[] args) {
        String printStr;
        for (int i = 1; i <= 100; i++) {
            printStr = checkDivider(i);
            if (printStr.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(printStr);
            }
        }
    }

    public static String checkDivider(int number) {
        StringBuilder result = new StringBuilder("");
        if (number % 3 == 0) {
            result.append("Fizz");
        }
        if (number % 5 == 0) {
            result.append("Buzz");
        }
        return result.toString();
    }
}
