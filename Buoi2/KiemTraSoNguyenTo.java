package Buoi2;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên n: ");
        int n = s.nextInt();

        if (soNguyenTo(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
        s.close();
    }

    public static boolean soNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
