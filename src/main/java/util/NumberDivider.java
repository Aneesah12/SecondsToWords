package util;

public class NumberDivider {
    public String numberIsDivisibleByFive(int number) {
        if (number % 5 == 0) {
            return "number is divisible by five";
        } else {
            return "number is not divisible by five";
        }
    }

    public String numberIsDivisibleByDenominator(int number, int denominator) {
        if (number % denominator == 0) {
            return number + " is divisible by " + denominator;
        } else {
            return number + " is not divisible by " + denominator;
        }
    }

    public String numberDivider(int number, int denominator) {
        int answer = number / denominator;
        int remainder = number % denominator;
        if (number % denominator != 0) {
            return number + " divided by " + denominator + " is " + answer + " with remainder " + remainder;
        } else {
            return number + " divided by " + denominator + " is " + answer;
        }
    }
}