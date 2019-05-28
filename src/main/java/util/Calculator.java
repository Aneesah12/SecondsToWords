package util;

public class Calculator {

    public String addNumbers(String number1, String number2) {
        int answer =  Integer.parseInt(number1) + Integer.parseInt(number2);
        return "The answer is " + answer;
    }

    public String subtractNumbers(String number1, String number2) {
        int answer =  Integer.parseInt(number1) - Integer.parseInt(number2);
        return "The answer is " + answer;
    }

    public String multiplyNumbers(String number1, String number2) {
        int answer =  Integer.parseInt(number1) * Integer.parseInt(number2);
        return "The answer is " + answer;
    }

    public String divideNumbers(String number1, String number2) {
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);

        int answer = n1/n2;
        int remainder = n1%n2;

        if (n1%n2 != 0) {
            return "The answer is " + answer + " and " + "the remainder is " + remainder;
        } else {
            return "The answer is " + answer;
        }
    }

    public String operatorSelector(String operator, String number1, String number2) {
        String result;
        switch (operator) {
            case "+":
                result = addNumbers(number1, number2);
                break;
            case "-":
                result = subtractNumbers(number1, number2);
                break;
            case "*":
                result =  multiplyNumbers(number1, number2);
                break;
            case "/":
                result =  divideNumbers(number1, number2);
                break;
            default:
                throw new IllegalArgumentException("Invalid operator selected");
        }
        return result;
    }
}
