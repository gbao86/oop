package thuchanh1;

import java.util.Scanner;
//Bài 12: Kiểm tra số đối xứng
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();
        
        if (kiemTraDoiXung(n)) {
            System.out.println(n + " là số đối xứng.");
        } else {
            System.out.println(n + " không phải là số đối xứng.");
        }
    }

    public static int daoNguoc(int n) {
        int ketQua = 0;
        while (n != 0) {
            ketQua = ketQua * 10 + n % 10;
            n /= 10;
        }
        return ketQua;
    }

    public static boolean kiemTraDoiXung(int n) {
        return n == daoNguoc(n);
    }
}