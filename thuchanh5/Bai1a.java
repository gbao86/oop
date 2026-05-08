package thuchanh5;

import java.util.Scanner;

public class Bai1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập trọng lượng (kg): ");
        double w = sc.nextDouble();

        System.out.print("Nhập khoảng cách (km): ");
        double d = sc.nextDouble();

        if (w <= 0 || d <= 0) {
            System.out.println("Trọng lượng và khoảng cách phải lớn hơn 0");
            return;
        }

        double c;
        if (w < 2) {
            c = 15000;
        } else if (w <= 5) {
            c = 15000 + (w - 2) * 5000;
        } else if (w <= 10) {
            c = 30000 + (w - 5) * 8000;
        } else {
            c = 70000 + (w - 10) * 12000;
        }

        double h;
        if (d < 10) {
            h = 20000;
        } else if (d <= 50) {
            h = 20000 + (d - 10) * 2000;
        } else if (d <= 100) {
            h = 100000 + (d - 50) * 3500;
        } else {
            h = 275000 + (d - 100) * 5000;
        }

        double t = c * h;

        System.out.println();
        System.out.printf("Cước phí cơ bản theo trọng lượng: %.0f VNĐ%n", c);
        System.out.printf("Hệ số khoảng cách: %.0f VNĐ%n", h);
        System.out.printf("Tổng cước phí giao hàng (T): %.0f VNĐ%n", t);
    }
}

