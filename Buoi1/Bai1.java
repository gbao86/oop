package Buoi1;

import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        double a = f.nextDouble();
        System.out.print("Nhập số b: ");
        double b = f.nextDouble();

        System.out.println("Tổng: " + (a + b));
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));
        
        // Kiểm tra mẫu số khác 0 trước khi chia
        if (b != 0) {
            System.out.println("Thương: " + (a / b));
        } else {
            System.out.println("Không thể thực hiện phép chia vì b = 0");
        }
    }
}
