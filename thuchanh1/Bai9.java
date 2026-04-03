package thuchanh1;

import java.util.Scanner;
//Bài 9: Tính tổng và tích các chữ số của một số
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();
        
        System.out.println("Tổng các chữ số: " + tinhTong(n));
        System.out.println("Tích các chữ số: " + tinhTich(n));
    }

    public static int tinhTong(int n) {
        int tong = 0;
        n = Math.abs(n);
        while (n > 0) {
            tong += n % 10;
            n /= 10;
        }
        return tong;
    }

    public static int tinhTich(int n) {
        if (n == 0) return 0;
        int tich = 1;
        n = Math.abs(n);
        while (n > 0) {
            tich *= n % 10;
            n /= 10;
        }
        return tich;
    }
}