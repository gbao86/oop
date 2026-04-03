package thuchanh1;

import java.util.Scanner;
//Bài 10: Đếm số chữ số trong một số
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();
        
        System.out.println("Số chữ số là: " + demChuSo(n));
    }

    public static int demChuSo(int n) {
        if (n == 0) return 1;
        int dem = 0;
        n = Math.abs(n);
        while (n > 0) {
            dem++;
            n /= 10;
        }
        return dem;
    }
}