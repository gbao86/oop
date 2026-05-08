package thuchanh5;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Nhap a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap b: ");
        int b = scanner.nextInt();

        try {
            double resultDivide = calc.divide(a, b);
            System.out.println("Ket qua chia: " + resultDivide);
        } catch (ArithmeticException | NumberOutOfRangeException e) {
            System.out.println("Loi trong phep chia: " + e.getMessage());
        }

        try {
            int resultMultiply = calc.multiply(a, b);
            System.out.println("Ket qua nhan: " + resultMultiply);
        } catch (NumberOutOfRangeException e) {
            System.out.println("Loi trong phep nhan: " + e.getMessage());
        }

        scanner.close();
    }
}

class Calculator {
    public double divide(int a, int b) throws NumberOutOfRangeException {
        if (a < -1000 || a > 1000 || b < -1000 || b > 1000) {
            throw new NumberOutOfRangeException("Number is outside this computation");
        }
        if (b == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return (double) a / b;
    }

    public int multiply(int a, int b) throws NumberOutOfRangeException {
        if (a < -1000 || a > 1000 || b < -1000 || b > 1000) {
            throw new NumberOutOfRangeException("Number is outside this computation");
        }
        return a * b;
    }
}

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}