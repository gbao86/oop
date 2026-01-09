package Buoi1;

import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = j.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = j.nextDouble();

        double chuVi = (a + b) * 2;
        double dienTich = a * b;

        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);

        j.close();
    }
}