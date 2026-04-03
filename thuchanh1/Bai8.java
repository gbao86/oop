package thuchanh1;

import java.util.Scanner;
//Bài 8: Tìm chữ số đầu tiên và chữ số tận cùng của một số
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();
        
        System.out.println("Chữ số đầu tiên: " + timChuSoDau(n));
        System.out.println("Chữ số tận cùng: " + timChuSoCuoi(n));
    }

    public static int timChuSoDau(int n) {
        n = Math.abs(n);
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    public static int timChuSoCuoi(int n) {
        return Math.abs(n) % 10;
    }
}